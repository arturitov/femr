package femr.data.models.core;

import org.joda.time.DateTime;

/**
 * Created by trevor1 on 4/25/16.
 */
public interface IPatientEncounterTabFieldsUpdate {
    int getId();

    void setId(int id);

    int getUserId();

    void setUserId(int userId);

    int getPatientEncounterTabFieldsId();

    void setPatientEncounterTabFieldsId(int patientEncounterTabFieldsId);

    DateTime getDateUpdated();

    void setDateUpdated(DateTime dateUpdated);

    String getPreviousDiagnosis();

    void setPreviousDiagnosis(String previousDiagnosis);

    String getNewDiagnosis();

    void setNewDiagnosis(String newDiagnosis);

}
