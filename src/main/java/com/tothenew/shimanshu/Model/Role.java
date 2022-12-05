package com.tothenew.shimanshu.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "role_sequence")
    private Long id;

    @Column(length = 60)
    private String authority;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
    public Role(String authority) {
        this.authority = authority;
    }
}