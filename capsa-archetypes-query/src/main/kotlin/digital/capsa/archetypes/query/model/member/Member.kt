package digital.capsa.archetypes.query.model.member

import digital.capsa.archetypes.core.aggregates.Aggregate
import digital.capsa.archetypes.core.aggregates.MemberId
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity(name = "member")
@Table(name = "member")
data class Member(

    @Id
    override var id: MemberId,

    var firstName: String,

    var lastName: String,

    var email: String,

    var phone: String? = null
) : Aggregate<MemberId>()