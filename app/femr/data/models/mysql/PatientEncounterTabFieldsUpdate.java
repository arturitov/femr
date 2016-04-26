/*
     fEMR - fast Electronic Medical Records
     Copyright (C) 2014  Team fEMR

     fEMR is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or
     (at your option) any later version.

     fEMR is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with fEMR.  If not, see <http://www.gnu.org/licenses/>. If
     you have any questions, contact <info@teamfemr.org>.
*/
package femr.data.models.mysql;

import femr.data.models.core.IPatientEncounterTabFieldsUpdate;
import org.joda.time.DateTime;

import javax.persistence.*;

@Entity
@Table(name = "patient_encounter_tab_fields_updates")
public class PatientEncounterTabFieldsUpdate implements IPatientEncounterTabFieldsUpdate {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Column(name = "patient_encounter_tab_fields_id", nullable = false)
    private int patientEncounterTabFieldsId;
    @Column(name = "date_updated")
    private DateTime dateUpdated;
    @Column(name = "previous_diagnosis", nullable = true)
    private String previousDiagnosis;
    @Column(name = "new_diagnosis", nullable = true)
    private String newDiagnosis;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getUserId() {
        return userId;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int getPatientEncounterTabFieldsId() {
        return patientEncounterTabFieldsId;
    }

    @Override
    public void setPatientEncounterTabFieldsId(int patientEncounterTabFieldsId) {
        this.patientEncounterTabFieldsId = patientEncounterTabFieldsId;
    }

    @Override
    public DateTime getDateUpdated() {
        return dateUpdated;
    }

    @Override
    public void setDateUpdated(DateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String getPreviousDiagnosis() {
        return previousDiagnosis;
    }

    @Override
    public void setPreviousDiagnosis(String previousDiagnosis) {
        this.previousDiagnosis = previousDiagnosis;
    }

    @Override
    public String getNewDiagnosis() {
        return newDiagnosis;
    }

    @Override
    public void setNewDiagnosis(String newDiagnosis) {
        this.newDiagnosis = newDiagnosis;
    }


}
