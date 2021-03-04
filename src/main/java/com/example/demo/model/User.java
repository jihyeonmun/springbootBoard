package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@ToString(exclude = {"categoryList","answerList"})
@Accessors(chain = true)
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long kakaoId;

    private String nickname;
    private String identity;

    private String password;

    private String username;

    private String email;

    private Boolean enabled;

    private LocalDateTime lastLoginAt;

    private int loginFailCount; // integer의 용량 이 int보다 큼 바꿀라면 나중에 바꾸자

    @LastModifiedDate
    private LocalDateTime updatedAt;

    @LastModifiedBy
    private String updatedBy;

    @CreatedDate
    private LocalDateTime createdAt;

    private LocalDateTime uncreatedAt;

    //private Long adminUserId;
//
//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "useranwser")
//    private List<Answer> answerList;
//
//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "usercategory")
//    private List<Category> categoryList;
//
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns =  @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<Role> roles = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Board> boards = new ArrayList<>();
}
