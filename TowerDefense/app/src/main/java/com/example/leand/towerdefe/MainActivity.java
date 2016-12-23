package com.example.leand.towerdefe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageButton Esco1, Esco2, Esco3, Esco4;
    ImageButton ImageBtt00, ImageBtt01, ImageBtt02, ImageBtt03, ImageBtt10, ImageBtt11, ImageBtt12;
    ImageButton ImageBtt13, ImageBtt20, ImageBtt21, ImageBtt22, ImageBtt23, ImageBtt30, ImageBtt31;
    ImageButton ImageBtt32, ImageBtt33, ImageBtt40, ImageBtt41, ImageBtt42, ImageBtt43, ImageBtt50;
    ImageButton ImageBtt51, ImageBtt52, ImageBtt53, ImageBtt60, ImageBtt61, ImageBtt62, ImageBtt63;
    ImageButton ImageBtt70, ImageBtt71, ImageBtt72, ImageBtt73;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InicializarBtt();



        Esco1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Esco1.setVisibility(view.INVISIBLE);
            }
        });

    }

    protected void InicializarBtt()
    {
        Esco1 = (ImageButton) findViewById(R.id.Esco1);
        Esco2 = (ImageButton) findViewById(R.id.Esco2);
        Esco3 = (ImageButton) findViewById(R.id.Esco3);
        Esco4 = (ImageButton) findViewById(R.id.Esco4);

        ImageBtt00 = (ImageButton) findViewById(R.id.map0_0);
        ImageBtt01 = (ImageButton) findViewById(R.id.map0_1);
        ImageBtt02 = (ImageButton) findViewById(R.id.map0_2);
        ImageBtt03 = (ImageButton) findViewById(R.id.map0_3);
        ImageBtt10 = (ImageButton) findViewById(R.id.map1_0);
        ImageBtt11 = (ImageButton) findViewById(R.id.map1_1);
        ImageBtt12 = (ImageButton) findViewById(R.id.map1_2);
        ImageBtt13 = (ImageButton) findViewById(R.id.map1_3);
        ImageBtt20 = (ImageButton) findViewById(R.id.map2_0);
        ImageBtt21 = (ImageButton) findViewById(R.id.map2_1);
        ImageBtt22 = (ImageButton) findViewById(R.id.map2_2);
        ImageBtt23 = (ImageButton) findViewById(R.id.map2_3);
        ImageBtt30 = (ImageButton) findViewById(R.id.map3_0);
        ImageBtt31 = (ImageButton) findViewById(R.id.map3_1);
        ImageBtt32 = (ImageButton) findViewById(R.id.map3_2);
        ImageBtt33 = (ImageButton) findViewById(R.id.map3_3);
        ImageBtt40 = (ImageButton) findViewById(R.id.map4_0);
        ImageBtt41 = (ImageButton) findViewById(R.id.map4_1);
        ImageBtt42 = (ImageButton) findViewById(R.id.map4_2);
        ImageBtt43 = (ImageButton) findViewById(R.id.map4_3);
        ImageBtt50 = (ImageButton) findViewById(R.id.map5_0);
        ImageBtt51 = (ImageButton) findViewById(R.id.map5_1);
        ImageBtt52 = (ImageButton) findViewById(R.id.map5_2);
        ImageBtt53 = (ImageButton) findViewById(R.id.map5_3);
        ImageBtt60 = (ImageButton) findViewById(R.id.map6_0);
        ImageBtt61 = (ImageButton) findViewById(R.id.map6_1);
        ImageBtt62 = (ImageButton) findViewById(R.id.map6_2);
        ImageBtt63 = (ImageButton) findViewById(R.id.map6_3);
        ImageBtt70 = (ImageButton) findViewById(R.id.map7_0);
        ImageBtt71 = (ImageButton) findViewById(R.id.map7_1);
        ImageBtt72 = (ImageButton) findViewById(R.id.map7_2);
        ImageBtt73 = (ImageButton) findViewById(R.id.map7_3);
    }

    public void ClickMapa(View view)
    {
        Esco1.setVisibility(view.VISIBLE);
        Esco2.setVisibility(view.VISIBLE);
        Esco3.setVisibility(view.VISIBLE);
        Esco4.setVisibility(view.VISIBLE);
        // Aceder ao botao
        ImageButton m = (ImageButton)view;
        //m.setImageDrawable()
    }
    public void ClickEsc(View view)
    {
        Esco1.setVisibility(view.INVISIBLE);
        Esco2.setVisibility(view.INVISIBLE);
        Esco3.setVisibility(view.INVISIBLE);
        Esco4.setVisibility(view.INVISIBLE);
    }
}
