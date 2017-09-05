package kz.kbtu.profileapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ImageView profileImage;
    private TextView tvNumber;
    private TextView tvEmail;
    private TextView tvEmail2;
    private TextView tvAddress;
    private TextView tvName;
    private TextView tvSurname;
    private TextView tvIdentifier;
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private Profile profile1;
    private Profile profile2;
    private Profile profile3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setupProfiles();
        rbGroup.check(rb1.getId());
    }

    private void setupProfiles() {
        profile1 = new Profile("Alikhan", "Bakytbek", "Student", "+77081708980",
                "abakhitbek@gmail.com", "kbtu15bd@gmail.com", "Abay 150/230",
                "https://www.jamsadr.com/images/neutrals/person-donald-900x1080.jpg");
        profile2 = new Profile("Azamat", "Amanov", "Teacher",
                "+77012221315","azamat@mail.ru", "aza@gmail.com", "Gogol 22",
                "https://static01.nyt.com/images/2017/01/12/well/move/adam-bryant-headshot/adam-bryant-headshot-square320-v2.jpg");
        profile3 = new Profile("Ruslan", "Erbolat", "Manager", "+77074341233",
                "ruslan.erbolat@gmail.com", "rb@mail.ru", "Auezov 56", "" +
                "http://img.timeinc.net/time/daily/2010/1011/poy_nomination_agassi.jpg");
    }

    private void bindViews() {
        profileImage = (ImageView) findViewById(R.id.image_view_profile);
        tvNumber = (TextView)findViewById(R.id.tv_number);
        tvEmail = (TextView)findViewById(R.id.tv_email);
        tvEmail2 = (TextView)findViewById(R.id.tv_email2);
        tvAddress = (TextView)findViewById(R.id.tv_address);
        tvName = (TextView)findViewById(R.id.tv_name);
        tvSurname = (TextView)findViewById(R.id.tv_surname);
        tvIdentifier = (TextView)findViewById(R.id.tv_identifier);
        rbGroup = (RadioGroup)findViewById(R.id.rb_group);
        rb1 = (RadioButton)findViewById(R.id.rb_1);
        rb2 = (RadioButton)findViewById(R.id.rb_2);
        rb3 = (RadioButton)findViewById(R.id.rb_3);
        rb1.setOnCheckedChangeListener(this);
        rb2.setOnCheckedChangeListener(this);
        rb3.setOnCheckedChangeListener(this);

    }

    private void loadProfile(Profile p){
        tvName.setText(p.getName());
        tvSurname.setText(p.getSurname());
        tvIdentifier.setText(p.getIdentifier());
        tvNumber.setText(p.getNumber());
        tvEmail.setText(p.getEmail());
        tvEmail2.setText(p.getEmail2());
        tvAddress.setText(p.getAddress());
        Picasso.with(this).load(p.getUrl()).fit().centerCrop().into(profileImage);
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if(b){
            switch (compoundButton.getId()){
                case R.id.rb_1:
                    loadProfile(profile1);
                    break;
                case R.id.rb_2:
                    loadProfile(profile2);
                    break;
                case R.id.rb_3:
                    loadProfile(profile3);
                    break;
            }
        }
    }
}
