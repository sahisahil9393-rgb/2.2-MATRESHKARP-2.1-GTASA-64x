package ru.edgar.launcher.network;

import ru.edgar.launcher.activity.MainActivity;

public class Helper {
    //public static String androidPath = "/storage/emulated/0/Android/data/ru.edgar.space/files"; // (const char*)(g_libGTASA+0x63C4B8);
    public static String androidPath = MainActivity.getMainActivity().getExternalFilesDir("").getAbsolutePath(); // (const char*)(g_libGTASA+0x63C4B8);
}
