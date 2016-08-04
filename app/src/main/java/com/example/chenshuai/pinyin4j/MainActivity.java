package com.example.chenshuai.pinyin4j;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

//参考博客  http://blog.csdn.net/qq_20785431/article/details/50730342
public class MainActivity extends AppCompatActivity {
    String strPY=PinyinUtils.getPingYin("新年hello");//将字符串中的中文转化为拼音,英文字符不变 xinninhello
    String strA=PinyinUtils.getAlpha("新年hello");//汉字转换位汉语拼音首字母，英文字符不变   XNhello
    String strs=PinyinUtils.converterToFirstSpell("新年hello");//汉字转换位汉语拼音首字母，英文字符不变 XNhello



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=new TextView(this);
        tv.setText(strA);

        Log.i("TAG",strA);

    }
}
