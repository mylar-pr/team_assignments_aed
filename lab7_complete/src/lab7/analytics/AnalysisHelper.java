/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    //  key: UserId ; Value: sum of likes from all comments
    public void userWithMostLikes() {
        Map<Integer, Integer> userLikesCount = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
    
        for (User user : users.values()) {
            for (Comment c : user.getComments()) {
                int likes = 0;
                if (userLikesCount.containsKey(user.getId())) {
                    likes = userLikesCount.get(user.getId());
                }
                likes += c.getLikes();
                userLikesCount.put(user.getId(), likes);
            }
        }
        int max = 0;
        int maxId = 0;
        for (int id : userLikesCount.keySet()) {
            if (userLikesCount.get(id) > max) {
                max = userLikesCount.get(id);
                maxId = id;
            }
        }
        System.out.println("User with most likes: " + max + "\n" 
            + users.get(maxId));
    }
    
    // find 5 comments which have the most likes
    public void getFiveMostLikedComment() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        
        Collections.sort(commentList, new Comparator<Comment>() {
            @Override 
            public int compare(Comment o1, Comment o2) {
                return o2.getLikes() - o1.getLikes();
            }
        });
        
        System.out.println("5 most likes comments: ");
        for (int i = 0; i < commentList.size() && i < 5; i++) {
            System.out.println(commentList.get(i));
        }
    }
    
    public void getAverageLikesPerComment(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        List<Comment> commentList = new ArrayList<>(comments.values());
        int sum = 0;
        float avg = 0;
        for (Comment c : commentList) {
            sum = sum + c.getLikes();
        }
        avg = sum / (commentList.size());
        System.out.println("\n Average likes per comment =" + avg + "\n");
    }
    
    public void postWithMostComments(){
        Map<Integer,Integer> commentCount = new HashMap<>();
        Map<Integer,Post> posts  = DataStore.getInstance().getPosts();
        
        for(Post p : posts.values()){
            commentCount.put(p.getPostId(),p.getComments().size());
        }
        
        List<Integer> postID = new ArrayList<Integer>();
        List<Integer> CommentSize = new ArrayList<Integer>();
        int maxComments = 0;
        int maxId = 0;
        
        for (int id : commentCount.keySet()) {
            if (commentCount.get(id) > maxComments) {
                maxComments = commentCount.get(id);
                maxId = id;
            }
            postID.add(id);
            CommentSize.add(commentCount.get(id));
        }
        System.out.println("Most number of comments ---"+CommentSize.get(maxId));
        for (int i = 0; i < postID.size(); i++) {
            if (maxComments == CommentSize.get(i)) {
                System.out.println("\nPost with most comments is PostID:" + postID.get(i) + "\n" + "  Number of comments: " + CommentSize.get(i));
            }
        }
        
    }
    
    
    public void getPostWithMostLikedComments(){
        Map<Integer, Integer> likesCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (Post p : posts.values()) {
            List<Integer> likes_list = new ArrayList<Integer>();
            for (Comment c : p.getComments()) {
                int likes = 0;
                if (likesCount.containsKey(p.getPostId())) {
                    likes = likesCount.get(p.getPostId());
                }
                likes_list.add(c.getLikes());
            }
            likesCount.put(p.getPostId(), Collections.max(likes_list));
        }
        int max_value = 0;
        int maxId = 0;
//        int idd = 0;
        for (int id : likesCount.keySet()) {
            if (likesCount.get(id) > max_value) {
                max_value = likesCount.get(id);
                maxId = id;
//                idd = id;
            }
        }
        System.out.println("Post with most liked Comments : PostID: " + maxId + "\n Likes " + likesCount.get(maxId));
    }
    public void getMostInactiveUsersByPosts() {

        Map<Integer, Integer> postCount = new HashMap<>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (Post post : posts.values()) {
            int totalPosts = 0;
            if (postCount.containsKey(post.getUserId())) {
                totalPosts = postCount.get(post.getUserId());
            }

            totalPosts = totalPosts + 1;
            postCount.put(post.getUserId(), totalPosts);

        }
        
        

        Map<Integer, Integer> map = sortByValues((HashMap) postCount);
//        System.out.println(map);

        System.out.println("\n5 Most Inactive Users based on number of Posts");
        for (int i = 0; i < 5; i++) {
            System.out.println("UserID: " + (map.keySet().toArray()[i]) + " with " + map.get(map.keySet().toArray()[i]) + " post(s)");
        }

    }
    private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator Iterator = list.iterator(); Iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) Iterator.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
    
    
    public void getMostInactiveUsersbyComments() {

        Map<Integer, Integer> commentsCount = new HashMap<>();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        for (Comment comment : comments.values()) {
            int totalComments = 0;
            if (commentsCount.containsKey(comment.getUserId())) {
                totalComments = commentsCount.get(comment.getUserId());
            }

            totalComments = totalComments + 1;
            commentsCount.put(comment.getUserId(), totalComments);

        }

        Map<Integer, Integer> map = sortByValues((HashMap) commentsCount);

        System.out.println("\n5 Most Inactive Users based on number of Comments:");
        for (int i = 0; i < 5; i++) {
            System.out.println("UserID: " + (map.keySet().toArray()[i]) + " with " + map.get(map.keySet().toArray()[i]) + " comments)");
        }

    }
    
    
    public void getMostAndLeastActiveUsers() {

        Map<Integer, Integer> userScore = new HashMap<>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        for (User user : users.values()) {

            for (Comment c : user.getComments()) {
                int totalScore = 0;
                if (userScore.containsKey(user.getId())) {
                    totalScore = userScore.get(user.getId());
                    totalScore = totalScore + 1;

                }
                totalScore += c.getLikes();
                userScore.put(user.getId(), totalScore);
            }

        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    
        
        
    
    
}
