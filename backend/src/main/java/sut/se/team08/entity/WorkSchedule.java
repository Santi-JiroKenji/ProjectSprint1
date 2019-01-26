package sut.se.team08.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@NoArgsConstructor
public class WorkSchedule {
    @Id
    @SequenceGenerator(name = "schedule_seq", sequenceName = "schedule_seq")
    @GeneratedValue(generator = "schedule_seq", strategy = GenerationType.SEQUENCE)
    private @NonNull Long scheduleId;
//    private @NonNull String day;
    private @NonNull Date date;

    @ManyToOne
    private HealthLab healthLab;
    @ManyToOne
    private StaffPosition staffPosition;
    @ManyToOne
    private Staff staff;

/*    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate(){
        return date;
    }
*/
}
