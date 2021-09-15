package de.y4gn1.cos.user

import de.y4gn1.cos.penalty.Penalty
import de.y4gn1.cos.register.RegisterEntry
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity(name = "user")
class User(
        @Id
        @GeneratedValue
        val id: Int,
        val firstname: String,
        val lastname: String,
        val password: String?,
        val email: String,
        val picture: String,
        val loginEnabled: Boolean,
        @OneToMany(mappedBy = "userId")
        val registerEntries: List<RegisterEntry>,
        @OneToMany(mappedBy = "associatedId")
        val associatedPenalties: List<Penalty>,
        @OneToMany(mappedBy = "createdById")
        val createdPenalties: List<Penalty>,

) {
}