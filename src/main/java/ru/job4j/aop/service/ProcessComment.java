package ru.job4j.aop.service;

import org.springframework.stereotype.Component;
import ru.job4j.aop.model.Comment;

/**
 * @author dl
 * @date 08.07.2024 23:46
 */

@Component
public class ProcessComment {
    public void publishingComment(Comment comment) {
        System.out.println("Выполняем публикацию комментария : " + comment.getComment());
    }

    public int deleteComment(int commentId) {
        System.out.println("Выполняем удаление комментария : " + commentId);
        return commentId;
    }
}
