@override

protected void onCreate(Bundle savedinstanceState) (

super, onCreate (savedInstanceState);

setContentView(R.layout.activity_nain);

11 2. Initializing our variables & Inflating our Ul elegents

trueBTN = (Button) findViewByI.d.(R.1d.trueBTN):

falseBTN = (Button) findViewByI.d.(R.1d.falseBTN):

doneBTN = (Button) findViewByl.d.(R.id.doneBTN™);

questionTV = (TextView) findViewByi.d.(R. id.questionTV):

score = 0;

message = **:

// 3. do whatever you want your app to do with its Ul elements:

trueBTN.setOnClickListeneroew View.OnClickListener {

@Override

public void onClick(View vies) (

message = "Incorrect.";

myToast = Toast.makeText ( context: MainActivity,this, message, Toast.LENGTH_SHORT);

myToast. show();
score


duneBTN.setOnClickListener()
@Override
public boid onClick (View view) {
     //declare intent
Intent myintent = new Intent(MainActivity,this. ScoreActivity,Clear);

     //put extra lnfo in if needed
    //start the new activity
    startactivity(my intent)


)


