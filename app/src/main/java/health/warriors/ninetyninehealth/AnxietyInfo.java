package health.warriors.ninetyninehealth;

import java.util.Random;

/**
 * Created by Chenry on 2015-03-25.
 */
public class AnxietyInfo {
    private static int current = 0;
    public String info;
    public float rating;
    private static AnxietyInfo[] infos = {
            new AnxietyInfo("<b>Chamomile Tea</b> - If you have a jittery moment, a cup of chamomile tea might help calm you down. Some compounds in chamomile (Matricaria recutita) bind to the same brain receptors as drugs like Valium."),
            new AnxietyInfo("<b>Exercise</b> - It's safe, good for the brain, and a powerful antidote to depression and anxiety, both immediately and in the long term. If you exercise on a regular basis, you'll have more self-esteem and feel healthier."),
            new AnxietyInfo("<b>Diet</b> - Anxiety and panic have always been considered to be mental conditions, however new research has found anxiety may actually originate from the gut. That’s why so many people suffer from both Irritable Bowel Syndrome and Anxiety at the same time. A healthy diet will help you overcome anxiety and panic attacks."),
            new AnxietyInfo("<b>Limit time on social media</b> - It’s okay to use websites like Facebook to keep in touch with friends occasionally. When it becomes “an addiction”, excessive use promotes feelings of loneliness, low self-image, jealousy, insecurity and feelings of inadequacy – all of them leading to anxiety."),
            new AnxietyInfo("<b>Kava (aka Kava Kava)</b> - is possibly the most effective herbal supplement for moderate and severe anxiety. The Kava root has been extensively researched for its effects on stress, anxiety, and insomnia. Unlike other herbal anxiety supplements, kava is not only effective for anxiety symptoms – it's effective for anxious thoughts as well."),
            new AnxietyInfo("<b>Valerian Root</b> - An incredible effective sedative. It's used primarily as a sleep aid, but the sedative qualities of valerian are effective at soothing muscles and reducing mental and physical tension so that you can easily relax. It may also be used to relieve uterine cramps, persistent coughs, and bronchial spasms."),
            new AnxietyInfo("<b>Hold your breath</b> - Ok, let it out now. We're not recommending that you turn blue, but yoga breathing has been shown to be effective in lowering stress and anxiety."),
            new AnxietyInfo("<b>Magnesium</b> -  Researchers have found that Magnesium is necessary to dissipate the effects of traumatic stress that can occur from intense episodes of fear or anxiety. Magnesium also helps undo the bad programming from prior anxiety attacks by helping to create new brain response patterns not influenced by fear or anxiety. If you can, get a blood test and check to see if you have a magnesium deficiency. If you do, consider a natural magnesium supplement. You might be surprised by the results.")};
    public AnxietyInfo(String info) {
        this.info = info;
    }

    public static AnxietyInfo getAnxietyInfo() {

        AnxietyInfo info = infos[current];
        current = current + 1;
        if (current >= infos.length) {
            current = 0;
        }
        return info;
    }
}