package gorental.com.day4.Idoms;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import gorental.com.day4.R;

public class Idom extends AppCompatActivity {

    ArrayList<IdomClass> dataModels;
    ListView listView;
    private static IdomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idom);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView = (ListView) findViewById(R.id.lvidom);

        dataModels = new ArrayList<>();

        dataModels.add(new IdomClass("ABC","প্রাথমিক জ্ঞান", R.drawable.spaeker));
        dataModels.add(new IdomClass("A bed of roses","সুখ-স্বাচ্ছন্দ্যপূর্ণ জীবন", R.drawable.spaeker));
        dataModels.add(new IdomClass("A blessing in disguise", "বিপরীতে হিত", R.drawable.spaeker));
        dataModels.add(new IdomClass("A black sheep","কুলাঙ্গার", R.drawable.spaeker));
        dataModels.add(new IdomClass("At sixes and sevens","বিশৃঙ্খলা অবস্থায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("After all","সবকিছু সত্ত্বেও", R.drawable.spaeker));
        dataModels.add(new IdomClass("Alternative to","বিকল্প", R.drawable.spaeker));
        dataModels.add(new IdomClass("At least","অন্ততঃ", R.drawable.spaeker));
        dataModels.add(new IdomClass("A bad apple", "কোনো দলের সব ভালোর মধ্যে খারাপ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Apple of discord","বিবাদেয় বিষয়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Above all","প্রধানত / সর্বোপরি", R.drawable.spaeker));
        dataModels.add(new IdomClass("At large","স্বাধীন", R.drawable.spaeker));
        dataModels.add(new IdomClass("As if","যেন", R.drawable.spaeker));
        dataModels.add(new IdomClass("At last","অবশেষে", R.drawable.spaeker));
        dataModels.add(new IdomClass("At random","বেপরোয়া / এলোমেলো", R.drawable.spaeker));
        dataModels.add(new IdomClass("At one’s wit’s end", "হতবুদ্ধি", R.drawable.spaeker));
        dataModels.add(new IdomClass("At a stretch","একটানা", R.drawable.spaeker));
        dataModels.add(new IdomClass("All on a sudden","হঠাৎ", R.drawable.spaeker));
        dataModels.add(new IdomClass("At dagger drawn","খড়গহস্ত", R.drawable.spaeker));
        dataModels.add(new IdomClass("Achilles heel","দুর্বলতা বা ত্রুটি", R.drawable.spaeker));
        dataModels.add(new IdomClass("At all events","যাই ঘটুক সব ক্ষেত্রেই", R.drawable.spaeker));
        dataModels.add(new IdomClass("A heap of rubbish", "আবজর্না স্তুপ", R.drawable.spaeker));
        dataModels.add(new IdomClass("A head of sand","বালির স্তুপ, ", R.drawable.spaeker));
        dataModels.add(new IdomClass("A stem of bananas","এক কাঁদি কলা", R.drawable.spaeker));
        dataModels.add(new IdomClass("At a low ebb","নিম্নমুখী", R.drawable.spaeker));
        dataModels.add(new IdomClass("A tribe of Arabs","এক দল আরব", R.drawable.spaeker));
        dataModels.add(new IdomClass("A gang of thieves","চোরের দল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Burning question","তীব্র বিতর্কের বিষয়", R.drawable.spaeker));
        dataModels.add(new IdomClass("By hook or by crook","যে কোন উপায়ে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bed of roses","আরামদায়ক অবস্থা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bosom friend","অন্তরঙ্গ বন্ধু", R.drawable.spaeker));
        dataModels.add(new IdomClass("Beat about the bush","আজেবাজে কথা বলা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bad shoot","অসংগত অনুমান", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bell the cat","কোন কাজ যেটা অর্জন করা অসম্ভব", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bird of a feather","এক রকম স্বভাবের লোক", R.drawable.spaeker));
        dataModels.add(new IdomClass("Big cheese","দলের সবচেয়ে গুরুত্বপূর্ণ ব্যক্তি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bad debts","যে ঋন শোধ করা যাবে না", R.drawable.spaeker));
        dataModels.add(new IdomClass("By fits and starts","অনিয়মিত/মাঝে মাঝে", R.drawable.spaeker));
        dataModels.add(new IdomClass("By and large","প্রধানতঃ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bad blood","মনোমালিন্য/শত্রতা", R.drawable.spaeker));
        dataModels.add(new IdomClass("But me no buts","কিন্তু কিন্তু করো না", R.drawable.spaeker));
        dataModels.add(new IdomClass("Be up and doing","উঠে-পড়ে লাগা", R.drawable.spaeker));
        dataModels.add(new IdomClass("By leaps and bounds","অতি দ্রুতগতিতে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Breathe out","নিঃশ্বাস ত্যাগ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Breathe one's last","মারা যাওয়াা", R.drawable.spaeker));
        dataModels.add(new IdomClass("By and by","শীঘ্র", R.drawable.spaeker));
        dataModels.add(new IdomClass("Build castles in the air","আকাশ কুসুম চিন্তা করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Bad faith","বিশ্বাসঘাতকতা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Carry the day","জয়লাভ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Cats and dogs","মূষল ধারে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Cock and Bull Story", "গাঁজাখুরি গল্প", R.drawable.spaeker));
        dataModels.add(new IdomClass("Crying need","জরুরী প্রয়োজন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Crocodile tears","মায়া কান্না", R.drawable.spaeker));
        dataModels.add(new IdomClass("Catch red handed", "হাতে নাতে ধরা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Cut a sorry figure","খারাপ ফল করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Come off with flying colours","জয়লাভ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Cut to the quick","মর্মাহত হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Die in harness","কর্মরত অবস্থায় মারা যাওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Dead language","যে ভাষা এখন আর কথ্য নয়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Dead of night","মধ্য রাত্রি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Do yeoman's service","বিশেষ উপকার করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Dead against","তীব্র বিরোধী", R.drawable.spaeker));
        dataModels.add(new IdomClass("End in smoke","ব্যর্থ হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Engaged to","বাগদত্ত", R.drawable.spaeker));
        dataModels.add(new IdomClass("Far and wide","সর্বত্র", R.drawable.spaeker));
        dataModels.add(new IdomClass("From hand to mouth","দিন আনে দিন খায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Flesh and blood","রক্তমাংসের শরীর", R.drawable.spaeker));
        dataModels.add(new IdomClass("Fish out of water","অস্বস্তিকর অবস্থায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Fish in a troubled water","এলোমোলো অবস্থায় সুযোগ নেওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Fight shy","এড়িয়ে চলা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Get rid of","মুক্তি পাওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Gala Day","উৎসবের দিন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Grateful to","কৃতজ্ঞ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Hard nut to crack","কঠিন সমস্যা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Hard and fast","বাঁধা ধরা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Hold good","প্রযুক্ত হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Heart and soul","সর্বান্তঃকরণে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Have a bad time","দুঃসময়ে পড়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Household word","সকলের পরিচিত নাম", R.drawable.spaeker));
        dataModels.add(new IdomClass("Hard nut to crack","কঠিন সমস্যা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Hush money","ঘুষ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Have ones eyes","কারও হাতে বিস্তর কাজ থাকা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Host in himself","একাই একশ", R.drawable.spaeker));
        dataModels.add(new IdomClass("In vain","বৃথা", R.drawable.spaeker));
        dataModels.add(new IdomClass("In a nut shell","খুব সংক্ষেপে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In a hurry","তাড়াহুড়ার মধ্যে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In black and white","লিখিতভাবে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In full swing","পুরাদমে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In the mean time","ইতিমধ্যে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In order to","উদ্দেশ্য", R.drawable.spaeker));
        dataModels.add(new IdomClass("In lieu of","পরিবর্তে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In the doldrums","উদাসীন ভাবাপন্ন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Irony of fate","ভাগ্যের পরিহাস", R.drawable.spaeker));
        dataModels.add(new IdomClass("In fine","পরিশেষ", R.drawable.spaeker));
        dataModels.add(new IdomClass("In no time","শীঘ্র", R.drawable.spaeker));
        dataModels.add(new IdomClass("In a fix","মুশকিলে পতিত", R.drawable.spaeker));
        dataModels.add(new IdomClass("In the long run","পরিশেষে", R.drawable.spaeker));
        dataModels.add(new IdomClass("In force","বলবৎ",R.drawable.spaeker));
        dataModels.add(new IdomClass("Carry the day","জয়লাভ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Kith and kin","নিকট আত্মীয়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Keep your chin up","সুখি হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Carry the day","জয়লাভ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Maiden speech","প্রথম বক্তৃতা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Man of letters", "পন্ডিত লোক", R.drawable.spaeker));
        dataModels.add(new IdomClass("Make both ends meet", "আয়ব্যয় মেলানো", R.drawable.spaeker));
        dataModels.add(new IdomClass("Moot point","অমীমাংসিত বিষয়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Nip in the bud","অঙ্কুরে বিনষ্ট করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Null and void","বাতিল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Now and then","মাঝে মাঝে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Out of doors","বাহিরে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Out of date","অপ্রচলিত", R.drawable.spaeker));
        dataModels.add(new IdomClass("Out of sorts","ঈষৎ অসুস্থ", R.drawable.spaeker));
        dataModels.add(new IdomClass("On the contrary","বিপরীত পক্ষে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Of course" ,"অবশ্যই", R.drawable.spaeker));
        dataModels.add(new IdomClass("Out of order","বিকল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Out of temper","ক্রুদ্ধ", R.drawable.spaeker));
        dataModels.add(new IdomClass("On the wane","হ্রাসমান", R.drawable.spaeker));
        dataModels.add(new IdomClass("put the cart before the horse","স্বাভাবিক অবস্থা উলটাইয়া দেওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Carry the day","জয়লাভ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Red letter day","স্মরণীয় দিন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Red tape","আমলাতান্ত্রিকতা ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Rise and fall","উত্থান - পতন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Run a risk","ঝুকি নেওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Rank and file","সাধারণ লোক", R.drawable.spaeker));
        dataModels.add(new IdomClass("Right and left","এলো পাতাড়ি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Round the clock","সমস্ত দিন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Stone's throw","অতি নিকটে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Silver tongue","মিষ্ঠ ভাষী", R.drawable.spaeker));
        dataModels.add(new IdomClass("Stand by","সমর্থন করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Short cut","সংক্ষিপ্ত", R.drawable.spaeker));
        dataModels.add(new IdomClass("So and so","এরকম থাকা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Subject to ", "অধীন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Summer friends","সু সময়ের বন্ধু", R.drawable.spaeker));
        dataModels.add(new IdomClass("Slip of tongue","মুখ ফসকে উক্তি বের হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Slow and steady","ধীর স্থির ব্যক্তি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Slap on the wrist","মৃদু শাস্তি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Strike work","ধর্মঘট করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Step by step","ক্রমশ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Set fire to","আগুন লাগানো", R.drawable.spaeker));
        dataModels.add(new IdomClass("Safe and sound","নিরাপদে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Sine die","অনির্দিষ্ট কাল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Slip of the tongue", "বলায় সামান্য ভুল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Slip of the pen","লেখায় অসতর্কতাবশতঃ সামান্য ভুল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Slow coach","অলস প্রকৃতির লোক", R.drawable.spaeker));
        dataModels.add(new IdomClass("Set free","মুক্ত করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Square meal","পেট ভরা আহার", R.drawable.spaeker));
        dataModels.add(new IdomClass("Through thick and thin","বিশ্বাস করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Take after","একই রকম হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("To the brim","কানায় কানায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Through and through","পুঙ্খানুপুঙ্খু রুপে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Turn over a new leaf","নূতনের সূচনা", R.drawable.spaeker));
        dataModels.add(new IdomClass("The exact point","কাঁটায়-কাঁটায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("To the backbone","হাড়ে হাড়ে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Turn a deaf ear to","মনোযোগ না দেওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Take heart","সাহস করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("To go to the dogs","গোল্লায় গোল্লায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Throw dust in ones hands full","কারো চোখে ধূলো দেওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Take to heart","মর্মাহত হওয়া", R.drawable.spaeker));
        dataModels.add(new IdomClass("Turn down","প্রত্যাখান করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Tooth and nail","তীব্রভাবে", R.drawable.spaeker));
        dataModels.add(new IdomClass("To the letter","অক্ষরে অক্ষরে", R.drawable.spaeker));
        dataModels.add(new IdomClass("Tickled pink","খুব খুশি করানো", R.drawable.spaeker));
        dataModels.add(new IdomClass("The exact point","কাঁটায়-কাঁটায়", R.drawable.spaeker));
        dataModels.add(new IdomClass("Take one to task","তিরস্কার করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Trust to","বিশ্বাস করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("To the contrary","বিশ্বাস করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Up and downs","উন্থানপতন", R.drawable.spaeker));
        dataModels.add(new IdomClass("Under the weather","ভাল না/অসুস্থ", R.drawable.spaeker));
        dataModels.add(new IdomClass("Under age","অপ্রাপ্ত বয়স্ক", R.drawable.spaeker));
        dataModels.add(new IdomClass("Upper hand","প্রধান্য", R.drawable.spaeker));
        dataModels.add(new IdomClass("Up-to-date","আধুনিক", R.drawable.spaeker));
        dataModels.add(new IdomClass("Up to","পর্যন্ত", R.drawable.spaeker));
        dataModels.add(new IdomClass("Victim of","বলি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Vile sycophant","খঁয়ের খা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Well-to-do","সঙ্গতিপূর্ণ", R.drawable.spaeker));
        dataModels.add(new IdomClass("With a view to","উদ্দেশ্য", R.drawable.spaeker));
        dataModels.add(new IdomClass("Worthy of","যোগ্য", R.drawable.spaeker));
        dataModels.add(new IdomClass("Word of no implication","কথার কথা", R.drawable.spaeker));
        dataModels.add(new IdomClass("When pigs fly","কখনও না", R.drawable.spaeker));
        dataModels.add(new IdomClass("Without fail","অবশ্যই", R.drawable.spaeker));
        dataModels.add(new IdomClass("Well up","সুপন্ডিত", R.drawable.spaeker));
        dataModels.add(new IdomClass("Widow's mite","দরিদ্রর ক্ষুদ্র দান", R.drawable.spaeker));
        dataModels.add(new IdomClass("Well off","স্বচ্ছল", R.drawable.spaeker));
        dataModels.add(new IdomClass("Carry the day","জয়লাভ করা", R.drawable.spaeker));
        dataModels.add(new IdomClass("Yellow dog","হীন ব্যক্তি", R.drawable.spaeker));
        dataModels.add(new IdomClass("Carry the day","জয়লাভ করা", R.drawable.spaeker));


        adapter = new IdomAdapter(dataModels, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                IdomClass data = dataModels.get(position);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

