package com.nestlings.jpa.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@Entity(name = "user_task")
@Getter
@Setter
@NoArgsConstructor
public class Task extends AbstractDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "taskId")
    private Long id;

    private String title;

    private Calendar dueDate;

    @Lob
    private String content;

    private Long userId;

    private Long assignBy;

    private String assignByName;

    private boolean favorite;

    private Integer contentTypeId;

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @Enumerated(EnumType.STRING)
    private RedirectTo redirectTo;

}
