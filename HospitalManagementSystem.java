class Hospital {
    String name;
    List<Doctor> doctors;
    List<Patient> patients;

    void admitPatient(Patient patient) {}
    void dischargePatient(Patient patient) {}
}

class Doctor {
    String name;
    String specialization;

    void diagnose(Patient patient) {}
}

class Patient {
    String name;
    int age;
    String ailment;

    void receiveTreatment() {}
}

class Appointment {
    String appointmentID;
    Doctor doctor;
    Patient patient;
    Date date;

    void schedule() {}
    void cancel() {}
}