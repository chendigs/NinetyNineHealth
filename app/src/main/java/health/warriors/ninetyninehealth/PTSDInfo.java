package health.warriors.ninetyninehealth;

/**
 * Created by Chenry on 2015-03-26.
 */
public class PTSDInfo {

    private static int current = 0;
    public String info;
    public float rating;

    private static PTSDInfo[] infos = {

               new PTSDInfo("<b>Eye Movement Desensitization and Reprocessing</b> -  The goal of EMDR therapy is to process completely the experiences that are causing problems, and to include new ones that are needed for full health. Processing does not mean talking about it. Means setting up a learning state that will allow experiences that are causing problems to be digested and stored appropriately in your brain."),
               new PTSDInfo("<b>Physical Activity</b> - such as exercise is perhaps the safest and most effective method of managing stress"),
               new PTSDInfo("<b>Diet</b> - It is strongly suggested that people who experience PTSD symptoms avoid stimulants, such as caffeine from chocolate, coffee, black tea, colas as well as alcohol. Maintaining balanced blood sugar levels helps stabilize moods. People will need to smaller and frequent meals and try to avoid processed, refined, and simple sugars."),
               new PTSDInfo("<b>Hops</b> - eases stress, nervousness and restlessness. It's useful for the treatment of anxiety disorders, insomnia and pain. Hops is anti-spasmodic, anti-inflammatory and has sedative properties, making it an excellent herb for muscle spasms."),
               new PTSDInfo("<b>Biofeedback</b> - Where a person is attached to an EEG machine and, by listening to the kind and amount of brain waves produced, learns to change them in ways that ultimately affect both behavior and feelings.")};
    public PTSDInfo(String info) {
        this.info = info;

    }
    public static PTSDInfo getPTSDInfo(){

        PTSDInfo info = infos[current];
        current = current +1;
        if (current >= infos.length) {
            current = 0;
        }
        return info;
    }
}

