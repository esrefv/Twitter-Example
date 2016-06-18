package javaapplication.twitter;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class JavaApplicationTwitter {
    private static int seconds;
    
    public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cf = new ConfigurationBuilder();
        
        
        cf.setDebugEnabled(true)
                .setOAuthConsumerKey("7VRNXFHYdKKpzVgWQTqqcvxWH")
                .setOAuthConsumerSecret("aWH3ldw9sSBTn74kFa1qXEr2IhHS5nSyqA4NKisH4tFVAZpIGY")
                .setOAuthAccessToken("4468692443-4etVoZ6TbyMPA3KH7Edbh1G5SpIeZpTiilC8AYn")
                .setOAuthAccessTokenSecret("oCV9qxsBvbGmGkBB9COTOaZ21XqW7W7bFwJGTg5VMCm60");
        
        TwitterFactory tf = new TwitterFactory(cf.build());
        Twitter twitter = tf.getInstance();
        List answers = new ArrayList();
        Status stat = null ;
        
        yazdir(stat,twitter);
        
//        while (true) {
//            int v1 = rand.nextInt(150) + 1;
//            int v2 = rand.nextInt(150) + 1;
//            int op = rand.nextInt(3);
//
//            Status stat = twitter.updateStatus(v1 + "  " + operators[op] + "  " + v2 + " =  ? Sonucu kaçtır");
////            List<Status> liste = twitter.getUserTimeline();
//            char islem = operators[op];
//            int sonuc;
//            if (islem == '+') {
//                sonuc = v1 + v2;
//            } else if (islem == '-') {
//                sonuc = v1 - v2;
//            } else {
//                sonuc = v1 * v2;
//            }
//
//            String ara = String.valueOf(sonuc);
//            Query query = new Query(ara);
//            System.out.println(v1 + " " + operators[op] + " " + v2 + "  " + sonuc);
////            Status sonTweet = liste.get(0);
//        User user = null;
//            try {
//
//        user = twitter.verifyCredentials();
//        List<Status> liste = twitter.getMentionsTimeline();
//                System.out.println("Showing @" + user.getScreenName() + "'s mentions.");
//                System.out.println("Status Update....");
//                System.out.println("getin" + stat.getInReplyToScreenName());
//
//                for (Status status : liste) {
//                    if (status.getId() == stat.getInReplyToStatusId()) {
//                        System.out.println(status.getUser().getName() + ":"
//                                + status.getText());
//                        StringBuilder builder = new StringBuilder(status.getText());
//                        builder.delete(0, 13);
//                        int cevap = Integer.parseInt(builder.toString());
//                        System.out.println(cevap);
//                    }
//                }
//            }
        
        
//            List<Status> tweets = new ArrayList<Status>();
//            try {
//                QueryResult result;
//                do {
//                    result = twitter.search(query);
//
//                    for (Status tweet : result.getTweets()) {
//                        // Replace this logic to check if it's a response to a known tweet
//                        if (tweet.getInReplyToStatusId() > 0) {
//                            tweets.add(tweet);
//                        }
//                    }
//                } while ((query = result.nextQuery()) != null);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//            try {
//                sleep(60000); // Örneğin her seferinde 1 saniye beklenecek
//
//            } catch (InterruptedException e) {
//            }
        
        
    }
    public static void  yazdir(Status x,Twitter y) throws TwitterException {
        char[] operators = {'+', '-', '*'};
        Random rand = new Random();
        User user=null;
        
        while (true) {
            int v1 = rand.nextInt(150) + 1;
            int v2 = rand.nextInt(150) + 1;
            int op = rand.nextInt(3);
            
            Status stat = y.updateStatus(v1 + "  " + operators[op] + "  " + v2 + " =  ? Sonucu kaçtır");
//            List<Status> liste = twitter.getUserTimeline();
            long last= stat.getId();
            char islem = operators[op];
            int sonuc;
            if (islem == '+') {
                sonuc = v1 + v2;
            } else if (islem == '-') {
                sonuc = v1 - v2;
            } else {
                sonuc = v1 * v2;
            }
            
            String ara = String.valueOf(sonuc);
            System.out.println(v1 + " " + operators[op] + " " + v2 + "  " + sonuc);
            try {
                sleep(300000); // Örneğin her seferinde 1 saniye beklenecek
//                Replying(user,x,y,last);
            } catch (InterruptedException e) {
            }
        }
    }
    
    
//    private static void Replying(User user, Status x, Twitter y,long last) throws TwitterException {
//        user = y.verifyCredentials();
//        List<Status> liste = y.getMentionsTimeline();
//        System.out.println("Showing @" + user.getScreenName() + "'s mentions.");
//        System.out.println("Status Update....");
//        System.out.println("getin" + x.getInReplyToScreenName());
//
//        for (Status status : liste) {
//            if (status.getId() == x.getInReplyToStatusId()) {
//                System.out.println(status.getUser().getName() + ":"
//                        + status.getText());
//                StringBuilder builder = new StringBuilder(status.getText());
//                builder.delete(0, 13);
//                int cevap = Integer.parseInt(builder.toString());
//                System.out.println(cevap);
//            }
//        }
//    }
    
}

