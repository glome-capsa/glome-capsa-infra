package digital.capsa.archetypes.eventbus.repo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface EventRepository : JpaRepository<EventRecord, UUID>
