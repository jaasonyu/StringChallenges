/***
 * Problem: In social media, hashtags always start with the "#" symbol.
 * Write a method that extracts and prints all the hashtags from a given string.
 * Expected output: Hashtag: #coding, Hashtag: #Java
 */

public class B_HashtagExtractor {

    public static void main(String[] args) {
        B_HashtagExtractor b = new B_HashtagExtractor();
    }

    public B_HashtagExtractor() {
        String post = "I love #coding #and #Java!";
        extractHashtags(post); // Output: Hashtag: #coding, Hashtag: #Java
    }

    public void extractHashtags(String post) {
        /* TODO: your code goes here */
        int x = post.indexOf("#");
        while(x != -1) {
            int u = post.indexOf(" ", x);
            if (x != u){

            }
            String n = post.substring(x, u);
            System.out.println(n);
            x = post.indexOf("#", u);
        }
    }

}
