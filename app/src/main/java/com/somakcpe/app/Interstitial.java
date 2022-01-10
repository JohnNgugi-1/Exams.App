package com.somakcpe.app;

import android.content.Context;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.LoadAdError;

public class Interstitial {
    private static InterstitialAd interstitialAd = null;
    private static InterstitialAd interstitialAd1 = null;
    private static InterstitialAd interstitialAd2 = null;
    private static InterstitialAd interstitialAd3 = null;
    private static InterstitialAd interstitialAd4 = null;
    private static InterstitialAd interstitialAd5 = null;

    public static void loadIt(Context ontext) {

        interstitialAd = new InterstitialAd(ontext);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
        interstitialAd1 = new InterstitialAd(ontext);
        interstitialAd1.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                interstitialAd1.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                interstitialAd1.loadAd(new AdRequest.Builder().build());
            }
        });
        interstitialAd2 = new InterstitialAd(ontext);
        interstitialAd2.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                interstitialAd2.loadAd(new AdRequest.Builder().build());
            }
        });
        interstitialAd3 = new InterstitialAd(ontext);
        interstitialAd3.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                interstitialAd3.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                interstitialAd3.loadAd(new AdRequest.Builder().build());
            }
        });
        interstitialAd4 = new InterstitialAd(ontext);
        interstitialAd4.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                interstitialAd4.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                interstitialAd4.loadAd(new AdRequest.Builder().build());
            }
        });
        interstitialAd5 = new InterstitialAd(ontext);
        interstitialAd5.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                interstitialAd5.loadAd(new AdRequest.Builder().build());
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.

            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the interstitial ad is closed.
                interstitialAd5.loadAd(new AdRequest.Builder().build());
            }
        });

    }

    public static void showInterstitialAd() {
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
            interstitialAd.loadAd(new AdRequest.Builder().build());
        }
    }
    public static void showInterstitialAd1() {
        if (interstitialAd1.isLoaded()) {
            interstitialAd1.show();
            interstitialAd1.loadAd(new AdRequest.Builder().build());
        }
    }
    public static void showInterstitialAd2() {
        if (interstitialAd2.isLoaded()) {
            interstitialAd2.show();
            interstitialAd2.loadAd(new AdRequest.Builder().build());
        }
    }
    public static void showInterstitialAd3() {
        if (interstitialAd3.isLoaded()) {
            interstitialAd3.show();
            interstitialAd3.loadAd(new AdRequest.Builder().build());
        }
    }
    public static void showInterstitialAd4() {
        if (interstitialAd4.isLoaded()) {
            interstitialAd4.show();
            interstitialAd4.loadAd(new AdRequest.Builder().build());
        }
    }
    public static void showInterstitialAd5() {
        if (interstitialAd5.isLoaded()) {
            interstitialAd5.show();
            interstitialAd5.loadAd(new AdRequest.Builder().build());
        }
    }
}
