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
    
    
    public void FiveMostInactiveUsersbyNoofPosts() {

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

        System.out.println("\n5 Most Inactive User based on the number of Posts:");
        for (int i = 0; i < 5; i++) {
            System.out.println("UserID: " + (map.keySet().toArray()[i]) + " with " + map.get(map.keySet().toArray()[i]) + "posts");
        }

    }
    
    
       private static HashMap sortByValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
  
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
