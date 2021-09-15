package de.y4gn1.cos.register

import de.y4gn1.cos.user.User
import java.util.*
import javax.persistence.*

@Entity(name = "register")
class RegisterEntry(
        @Id
        @GeneratedValue
        val id: Int,
        val date: Date,
        val movement: Int,
        val description: String,
        val newAmount: String,
        @ManyToOne(fetch=FetchType.LAZY)
        @JoinColumn(name="userId")
        val user: User,
) {
}