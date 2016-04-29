package cafe.adriel.nmsalphabet.util;

import android.content.Context;
import android.preference.PreferenceManager;

import cafe.adriel.nmsalphabet.Constant;
import cafe.adriel.nmsalphabet.R;
import cafe.adriel.nmsalphabet.ui.AddTranslationActivity;
import cafe.adriel.nmsalphabet.ui.MainActivity;
import cafe.adriel.nmsalphabet.ui.SettingsActivity;

public class ThemeUtil {
    public static final String THEME_1 = "theme1";
    public static final String THEME_2 = "theme2";
    public static final String THEME_3 = "theme3";
    public static final String THEME_4 = "theme4";
    public static final String THEME_5 = "theme5";

    private static String currentTheme = THEME_1;

    private static String getCurrentTheme(Context context){
        try {
            currentTheme = PreferenceManager.getDefaultSharedPreferences(context)
                    .getString(Constant.SETTINGS_ACCOUNT_THEME, ThemeUtil.THEME_1);
            return currentTheme;
        } catch (Exception e) {
            e.printStackTrace();
            currentTheme = THEME_1;
            return currentTheme;
        }
    }

    public static void setCustomTheme(Context context){
        switch (getCurrentTheme(context)){
            case THEME_2:
                if(context instanceof MainActivity){
                    context.setTheme(R.style.AppTheme2_NoActionBar);
                } else if(context instanceof AddTranslationActivity || context instanceof SettingsActivity){
                    context.setTheme(R.style.AppTheme2);
                }
                break;
            case THEME_3:
                if(context instanceof MainActivity){
                    context.setTheme(R.style.AppTheme3_NoActionBar);
                } else if(context instanceof AddTranslationActivity || context instanceof SettingsActivity){
                    context.setTheme(R.style.AppTheme3);
                }
                break;
            case THEME_4:
                if(context instanceof MainActivity){
                    context.setTheme(R.style.AppTheme4_NoActionBar);
                } else if(context instanceof AddTranslationActivity || context instanceof SettingsActivity){
                    context.setTheme(R.style.AppTheme4);
                }
                break;
            case THEME_5:
                if(context instanceof MainActivity){
                    context.setTheme(R.style.AppTheme5_NoActionBar);
                } else if(context instanceof AddTranslationActivity || context instanceof SettingsActivity){
                    context.setTheme(R.style.AppTheme5);
                }
                break;
            default:
                if(context instanceof MainActivity){
                    context.setTheme(R.style.AppTheme1_NoActionBar);
                } else if(context instanceof AddTranslationActivity || context instanceof SettingsActivity){
                    context.setTheme(R.style.AppTheme1);
                }
        }
    }

    public static int getPrimaryColor(Context context){
        switch (currentTheme){
            case THEME_2:
                return context.getResources().getColor(R.color.colorPrimaryTheme2);
            case THEME_3:
                return context.getResources().getColor(R.color.colorPrimaryTheme3);
            case THEME_4:
                return context.getResources().getColor(R.color.colorPrimaryTheme4);
            case THEME_5:
                return context.getResources().getColor(R.color.colorPrimaryTheme5);
            default:
                return context.getResources().getColor(R.color.colorPrimaryTheme1);
        }
    }

    public static int getPrimaryDarkColor(Context context){
        switch (currentTheme){
            case THEME_2:
                return context.getResources().getColor(R.color.colorPrimaryDarkTheme2);
            case THEME_3:
                return context.getResources().getColor(R.color.colorPrimaryDarkTheme3);
            case THEME_4:
                return context.getResources().getColor(R.color.colorPrimaryDarkTheme4);
            case THEME_5:
                return context.getResources().getColor(R.color.colorPrimaryDarkTheme5);
            default:
                return context.getResources().getColor(R.color.colorPrimaryDarkTheme1);
        }
    }

    public static int getAccentColor(Context context){
        switch (currentTheme){
            case THEME_2:
                return context.getResources().getColor(R.color.colorAccentTheme2);
            case THEME_3:
                return context.getResources().getColor(R.color.colorAccentTheme3);
            case THEME_4:
                return context.getResources().getColor(R.color.colorAccentTheme4);
            case THEME_5:
                return context.getResources().getColor(R.color.colorAccentTheme5);
            default:
                return context.getResources().getColor(R.color.colorAccentTheme1);
        }
    }

}