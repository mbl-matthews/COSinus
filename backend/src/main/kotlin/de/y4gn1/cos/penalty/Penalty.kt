package de.y4gn1.cos.penalty

import de.y4gn1.cos.user.User
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*

class Penalty(
        @Id
        @GeneratedValue
        val id: Int,
        val date: Date,
        val reason: String,
        val fine: String,
        val done: Boolean,
        val doneTimestamp: OffsetDateTime,
        @ManyToOne(fetch= FetchType.LAZY)
        @JoinColumn(name="associatedId")
        val associatedUser: User,
        @ManyToOne(fetch= FetchType.LAZY)
        @JoinColumn(name="createdById")
        val createdByUser: User,
) {
}