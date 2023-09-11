package entity;

import javax.persistence.*;

// 손자
@Entity
@IdClass(GrandChildId.class)
public class GrandChild {

    // 식별 관계는 기본 키와 외래 키를 같이 매핑해야 한다.
    // 식별자 매핑인 @Id와 @ManyToOne을 같이 사용한다.
    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID"),
            @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    @Id @Column(name = "GRANDCHILD_ID")
    private String id;

    private String name;
}
