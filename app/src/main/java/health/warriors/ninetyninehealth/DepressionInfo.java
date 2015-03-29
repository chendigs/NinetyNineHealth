package health.warriors.ninetyninehealth;

/**
 * Created by Chenry on 2015-03-26.
 */
public class DepressionInfo {
    private static int current = 0;
    public String info;
    public float rating;

    private static DepressionInfo[] infos = {

            new DepressionInfo("<b>Get enough sleep</b> - Depression can make it hard to get enough shut-eye, and too little sleep can make depression worse. What can you do? Start by making some changes to your lifestyle. Go to bed and get up at the same time every day. Try not to nap. Take all the distractions out of your bedroom -- no computer and no TV. In time, you may find your sleep improves."),
            new DepressionInfo("<b>Challenge negative thoughts</b> - In your fight against depression, a lot of the work is mental -- changing how you think. When you're depressed, you leap to the worst possible conclusions.The next time you're feeling terrible about yourself, use logic as a natural depression treatment."),
            new DepressionInfo("<b>Eat healthy</b> - There is no magic diet that fixes depression. It's a good idea to watch what you eat, though. If depression tends to make you overeat, getting in control of your eating will help you feel better."),
            new DepressionInfo("<b>Light Therapy</b> - During the short, dark days of winter, some people are prone to a type of depression called seasonal affective disorder. One way to ease symptoms may be light therapy, in which you sit near a brightly lit box that mimics outdoor light. The therapy generally starts with daily sessions of about 15 minutes and increases to up to two hours daily. The timing depends upon the severity of symptoms and the intensity of the light, which a doctor can determine. Although the therapy doesn't cure depression, it can ease symptoms, sometimes after only a couple days."),
            new DepressionInfo("<b>Mood Diary</b> - A mood diary keeps negative events in perspective and serves as a reminder that good days do happen."),
            new DepressionInfo("<b>Support Groups</b> - These groups provide education on depression, a community of support, and the opportunity to learn from people dealing with similar issues. As an alternative for those not interested in talking about depression. Find a group that shares your interests, whether it's a book club or yoga."),
            new DepressionInfo("<b>Cognitive Behavioral Therapy</b> - It is based on the fact that thoughts trigger feelings. Being aware of your thoughts and learning to change destructive patterns could alter the way your brain works and your reaction to situations. CBT is considered short-term therapy, often lasting for 10 to 20 sessions. It has been shown to be as effective as medication in treating mild to moderate depression.")};

    public DepressionInfo(String info){
        this.info = info;

    }

    public static DepressionInfo getDepressionInfo(){

        DepressionInfo info = infos[current];
        current = current + 1;
        if (current >= infos.length) {
            current = 0;
        }
        return info;

    }
}

