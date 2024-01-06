package com.example.era;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class search extends AppCompatActivity {

    TextView aidlinks,airlinks,aphlinks,ashlinks,athlinks,cancerlinks,cllinks,cglinks,cawlinks,cchlinks,dishlinks,
    dmlinks,dahlinks,ecilinks,emrlinks,eelinks,firelinks,hahinks,iahinks,lpglinks,mhlinks,nahlinks,nchinks,
    nerslinks,policetvs,raillinks,relinks,rhlinks,wilinks,whlinks;
    Button aidlinksb,airlinksb,aphlinksb,ashlinksb,athlinksb,cancerlinksb,cllinksb,cglinksb,cawlinksb,cchlinksb,dishlinksb,
            dmlinksb,dahlinksb,ecilinksb,emrlinksb,eelinksb,firelinksb,hahinksb,iahinksb,lpglinksb,mhlinksb,nahlinksb,nchinksb,
            nerslinksb,policetvsb,raillinksb,relinksb,rhlinksb,wilinksb,whlinksb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        aidlinks = findViewById(R.id.tvs1);
        aidlinks.setMovementMethod(LinkMovementMethod.getInstance());
        airlinks = findViewById(R.id.tvs2);
        airlinks.setMovementMethod(LinkMovementMethod.getInstance());
        aphlinks = findViewById(R.id.tvs3);
        aphlinks.setMovementMethod(LinkMovementMethod.getInstance());
        ashlinks = findViewById(R.id.tvs4);
        ashlinks.setMovementMethod(LinkMovementMethod.getInstance());
        athlinks = findViewById(R.id.tvs5);
        athlinks.setMovementMethod(LinkMovementMethod.getInstance());
        cancerlinks = findViewById(R.id.tvs6);
        cancerlinks.setMovementMethod(LinkMovementMethod.getInstance());
        cllinks = findViewById(R.id.tvs7);
        cllinks.setMovementMethod(LinkMovementMethod.getInstance());
        cglinks = findViewById(R.id.tvs8);
        cglinks.setMovementMethod(LinkMovementMethod.getInstance());
        cawlinks = findViewById(R.id.tvs9);
        cawlinks.setMovementMethod(LinkMovementMethod.getInstance());
        cchlinks = findViewById(R.id.tvs10);
        cchlinks.setMovementMethod(LinkMovementMethod.getInstance());
        dishlinks = findViewById(R.id.tvs11);
        dishlinks.setMovementMethod(LinkMovementMethod.getInstance());
        dmlinks = findViewById(R.id.tvs12);
        dmlinks.setMovementMethod(LinkMovementMethod.getInstance());
        dahlinks = findViewById(R.id.tvs13);
        dahlinks.setMovementMethod(LinkMovementMethod.getInstance());
        ecilinks = findViewById(R.id.tvs14);
        ecilinks.setMovementMethod(LinkMovementMethod.getInstance());
        emrlinks = findViewById(R.id.tvs15);
        emrlinks.setMovementMethod(LinkMovementMethod.getInstance());
        eelinks = findViewById(R.id.tvs16);
        eelinks.setMovementMethod(LinkMovementMethod.getInstance());
        firelinks= findViewById(R.id.tvs17);
        firelinks.setMovementMethod(LinkMovementMethod.getInstance());
        hahinks = findViewById(R.id.tvs18);
        hahinks.setMovementMethod(LinkMovementMethod.getInstance());
        iahinks = findViewById(R.id.tvs19);
        iahinks.setMovementMethod(LinkMovementMethod.getInstance());
        lpglinks = findViewById(R.id.tvs20);
        lpglinks.setMovementMethod(LinkMovementMethod.getInstance());
        mhlinks = findViewById(R.id.tvs21);
        mhlinks.setMovementMethod(LinkMovementMethod.getInstance());
        nahlinks = findViewById(R.id.tvs22);
        nahlinks.setMovementMethod(LinkMovementMethod.getInstance());
        nchinks = findViewById(R.id.tvs23);
        nchinks.setMovementMethod(LinkMovementMethod.getInstance());
        nerslinks = findViewById(R.id.tvs24);
        nerslinks.setMovementMethod(LinkMovementMethod.getInstance());
        policetvs = findViewById(R.id.tvs25);
        policetvs.setMovementMethod(LinkMovementMethod.getInstance());
        raillinks = findViewById(R.id.tvs26);
        raillinks.setMovementMethod(LinkMovementMethod.getInstance());
        relinks = findViewById(R.id.tvs27);
        relinks.setMovementMethod(LinkMovementMethod.getInstance());
        rhlinks = findViewById(R.id.tvs28);
        rhlinks.setMovementMethod(LinkMovementMethod.getInstance());
        wilinks = findViewById(R.id.tvs29);
        wilinks.setMovementMethod(LinkMovementMethod.getInstance());
        whlinks = findViewById(R.id.tvs30);
        whlinks.setMovementMethod(LinkMovementMethod.getInstance());


        aidlinksb = findViewById(R.id.b1);
        airlinksb = findViewById(R.id.b2);aphlinksb = findViewById(R.id.b3);ashlinksb = findViewById(R.id.b4);
        athlinksb = findViewById(R.id.b5);cancerlinksb = findViewById(R.id.b6);cllinksb = findViewById(R.id.b7);
        cglinksb = findViewById(R.id.b8);cawlinksb = findViewById(R.id.b9);cchlinksb = findViewById(R.id.b10);dishlinksb = findViewById(R.id.b11);
                dmlinksb = findViewById(R.id.b12);dahlinksb = findViewById(R.id.b13);ecilinksb = findViewById(R.id.b14);
                emrlinksb = findViewById(R.id.b15);eelinksb = findViewById(R.id.b16);firelinksb = findViewById(R.id.b17);
                hahinksb = findViewById(R.id.b18);iahinksb = findViewById(R.id.b19);lpglinksb = findViewById(R.id.b20);
                mhlinksb = findViewById(R.id.b21);nahlinksb = findViewById(R.id.b22);nchinksb = findViewById(R.id.b23);
                nerslinksb = findViewById(R.id.b24);policetvsb = findViewById(R.id.b25);raillinksb = findViewById(R.id.b26);
                relinksb = findViewById(R.id.b27);rhlinksb = findViewById(R.id.b28);wilinksb = findViewById(R.id.b29);whlinksb = findViewById(R.id.b30);


        aidlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1097));
            startActivity(callIntent);
        });
        airlinksb.setOnClickListener(v -> {
            Intent callIntent1 = new Intent(Intent.ACTION_DIAL);
            callIntent1.setData(Uri.parse("tel:9540161344"));
            startActivity(callIntent1);
        });
        aphlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:1066"));
            startActivity(callIntent);
        });
        ashlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1091));
            startActivity(callIntent);
        });

        athlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1090));
            startActivity(callIntent);
        });
        cancerlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:18004205866"));
            startActivity(callIntent);
        });
        cllinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1098));
            startActivity(callIntent);
        });
        cglinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1554));
            startActivity(callIntent);
        });
        cawlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1096));
            startActivity(callIntent);
        });
        cchlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+155260));
            startActivity(callIntent);
        });
        dishlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1070));
            startActivity(callIntent);
        });
        dmlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+108));
            startActivity(callIntent);
        });
        dahlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:1800110031"));
            startActivity(callIntent);
        });
        ecilinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1950));
            startActivity(callIntent);
        });
        emrlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+108));
            startActivity(callIntent);
        });
        eelinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1926));
            startActivity(callIntent);
        });
        firelinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+101));
            startActivity(callIntent);
        });
        hahinks.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1097));
            startActivity(callIntent);
        });
        iahinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1094));
            startActivity(callIntent);
        });
        lpglinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1906));
            startActivity(callIntent);
        });
        mhlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+108));
            startActivity(callIntent);
        });
        nahlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1097));
            startActivity(callIntent);
        });
        nchinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:1800114000"));
            startActivity(callIntent);
        });
        nerslinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+112));
            startActivity(callIntent);
        });
        policetvsb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+100));
            startActivity(callIntent);
        });
        raillinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1322));
            startActivity(callIntent);
        });
        relinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+139));
            startActivity(callIntent);
        });
        rhlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1322));
            startActivity(callIntent);
        });
        wilinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+1717));
            startActivity(callIntent);
        });
        whlinksb.setOnClickListener(v -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:"+181));
            startActivity(callIntent);
        });


    }

    void assinId(TextView temptv,int id) {
        temptv = findViewById(id);
        temptv.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
