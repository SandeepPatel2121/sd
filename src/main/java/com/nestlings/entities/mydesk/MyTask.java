
package com.nestlings.entities.mydesk;

import com.nestlings.jpa.entities.RedirectTo;
import com.nestlings.jpa.entities.TaskStatus;
import lombok.*;


/**
 *
 * @author ú
 */
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyTask {

   private Long taskId;

   private String title;

   private String content;

   private String dueDate;

   private Long userId;

   private Long assignBy;

   private String assignByName;

   private boolean favorite;

   private TaskStatus taskStatus;

   private RedirectTo redirectTo;
}
