package com.somakcpe.app.ui.send;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.somakcpe.app.Interstitial;
import com.somakcpe.app.MainActivity;
import com.somakcpe.app.Play;
import com.somakcpe.app.R;
import com.somakcpe.app.Reward;

public class SendFragment extends Fragment {

    private InterstitialAd mInterstitialAd;
    private WebView myWebView;
    private AdView adView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_send, container, false);
        //Interstitial.showInterstitialAd2();
        FrameLayout adContainerView = root.findViewById(R.id.ad_view_containerSend);
        FrameLayout.LayoutParams adsParams =new FrameLayout.LayoutParams(FrameLayout.LayoutParams.FILL_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.BOTTOM|android.view.Gravity.CENTER_HORIZONTAL);
        adView = new AdView(getActivity());
        adView.setAdUnitId(getString(R.string.banner_home));
        adContainerView.addView(adView, adsParams);
        loadBanner();
        

        myWebView = root.findViewById(R.id.share);

        myWebView.setWebChromeClient(new WebChromeClient());
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/R.html");
        myWebView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && event.getAction() == MotionEvent.ACTION_UP && myWebView.canGoBack()) {
                    myWebView.goBack();
                    return true;
                }
                return false;
            }

        });
        return root;
    }
    private void loadBanner() {
        // Create an ad request. Check your logcat output for the hashed device ID
        // to get test ads on a physical device, e.g.,
        // "Use AdRequest.Builder.addTestDevice("ABCDE0123") to get test ads on this
        // device."
        AdRequest adRequest = new AdRequest.Builder().build();

        AdSize adSize = getAdSize();
        // Step 4 - Set the adaptive ad size on the ad view.
        adView.setAdSize(adSize);


        // Step 5 - Start loading the ad in the background.
        adView.loadAd(adRequest);
    }

    private AdSize getAdSize() {
        // Step 2 - Determine the screen width (less decorations) to use for the ad width.
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;

        int adWidth = (int) (widthPixels / density);

        // Step 3 - Get adaptive ad size and return for setting on the ad view.
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(getContext(), adWidth);
    }
    /*private WebView myWebView;
    private Context mContext;
    private InterstitialAd mInterstitialAd;
    private RewardedVideoAd mRewardedVideoAd;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_send, container, false);
        //ImageView imageview = (ImageView) v.findViewById(R.id.imageView2);
        Interstitial.showInterstitialAd2();
        AdRequest adRequest = new AdRequest.Builder().build();
        AdView mAdView =  v.findViewById(R.id.adViewSend);
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Log.d("TAG", "ad loaded.");
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Log.d("TAG", "ad failed to load");
            }

            @Override
            public void onAdOpened() {
                Log.d("TAG", "ad opened.");
            }

            @Override
            public void onAdClicked() {
                Log.d("TAG", "ad clicked");
            }

            @Override
            public void onAdLeftApplication() {
                Log.d("TAG", "ad left application");
            }

            @Override
            public void onAdClosed() {
                Log.d("TAG", "ad closed.");
            }
        });

        /*mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }
        });*/
        /*mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(getContext());
        mRewardedVideoAd.setRewardedVideoAdListener(this);
        mRewardedVideoAd.loadAd("ca-app-pub-8737004905441026/3091506195",
                new AdRequest.Builder().build());
        Button btn = v.findViewById(R.id.prb);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadRewardedVideoAd();
            }
        });

        return v;
    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

    }

    @Override
    public void onRewarded(RewardItem rewardItem) {

     OpenPrivate();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

    }

    @Override
    public void onRewardedVideoCompleted() {

    }
    public void OpenPrivate(){
        Intent intent = new Intent(getContext(), Reward.class);
        startActivity(intent);
    }
    private void loadRewardedVideoAd() {

        if (mRewardedVideoAd.isLoaded()) {
            mRewardedVideoAd.show();
        }
        mRewardedVideoAd.loadAd("ca-app-pub-8737004905441026/3325611737",
                new AdRequest.Builder().build());
    }*/
}
