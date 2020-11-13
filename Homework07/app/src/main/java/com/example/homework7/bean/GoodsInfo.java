package com.example.homework7.bean;

import com.example.homework7.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "拉芳", "鱼子酱养发膜", "多分", "潘婷", "Fino", "欧莱雅","海飞丝","飘柔"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "拉芳 枯发毛躁不再见",
            "鱼子酱养发膜五层护理",
            "多分滋养修护",
            "潘婷三分钟奇迹护发",
            "Fino预防损伤",
            "欧莱雅柔顺发质",
            "海飞丝 花果香气",
            "飘柔 精油润养柔顺"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {48, 58, 68, 47, 53, 62,55,39};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.lafang_s, R.drawable.yuzijiang_s, R.drawable.duofen_s,
            R.drawable.panting_s, R.drawable.fino_s, R.drawable.oulaiya_s,R.drawable.haifeisi_s,R.drawable.piaorou_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.lafang, R.drawable.yuzijiang, R.drawable.duofen,
            R.drawable.panting, R.drawable.fino, R.drawable.oulaiya,R.drawable.haifeisi,R.drawable.piaorou
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
