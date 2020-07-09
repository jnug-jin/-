package com.example.dont_get_sick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;

import java.util.ArrayList;

public class Ps2_Activity extends AppCompatActivity {
    ArrayList<MemberData> datas= new ArrayList<MemberData>();
    ListView listview;
    private Object Map_View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps2_);

        MapView mapView =new MapView(this);
        RelativeLayout mapViewContainer = (RelativeLayout)findViewById((Integer) Map_View);
        mapViewContainer.addView(mapView);


        datas.add( new MemberData("유세윤", "대한민국", R.drawable.test_img01));
        datas.add( new MemberData("블레어", "호주", R.drawable.test_img02));
        datas.add( new MemberData("기욤 패트리", "캐나다", R.drawable.test_img03));
        datas.add( new MemberData("장위안", "중국", R.drawable.test_img04));
        datas.add( new MemberData("로빈", "프랑스", R.drawable.test_img05));
        datas.add( new MemberData("다니엘", "대한민국", R.drawable.test_img06));
        datas.add( new MemberData("알베르토", "대한민국", R.drawable.test_img07));
        datas.add( new MemberData("샘오취리", "대한민국", R.drawable.test_img08));

        //ListView 객체 찾아와서 참조
        listview= (ListView)findViewById(R.id.listview);


    }

    private class Map_View {
    }
}
