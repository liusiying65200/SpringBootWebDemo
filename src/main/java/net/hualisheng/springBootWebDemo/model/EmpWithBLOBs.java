package net.hualisheng.springBootWebDemo.model;

public class EmpWithBLOBs extends Emp {
    private String description;

    private String cooperationFiles;

    private String cooperationDesc;

    private String cooperationAgreement;

    private String lockReason;

    private String agreement;

    private String agreementNote;

    private String license;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getCooperationFiles() {
        return cooperationFiles;
    }

    public void setCooperationFiles(String cooperationFiles) {
        this.cooperationFiles = cooperationFiles == null ? null : cooperationFiles.trim();
    }

    public String getCooperationDesc() {
        return cooperationDesc;
    }

    public void setCooperationDesc(String cooperationDesc) {
        this.cooperationDesc = cooperationDesc == null ? null : cooperationDesc.trim();
    }

    public String getCooperationAgreement() {
        return cooperationAgreement;
    }

    public void setCooperationAgreement(String cooperationAgreement) {
        this.cooperationAgreement = cooperationAgreement == null ? null : cooperationAgreement.trim();
    }

    public String getLockReason() {
        return lockReason;
    }

    public void setLockReason(String lockReason) {
        this.lockReason = lockReason == null ? null : lockReason.trim();
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement == null ? null : agreement.trim();
    }

    public String getAgreementNote() {
        return agreementNote;
    }

    public void setAgreementNote(String agreementNote) {
        this.agreementNote = agreementNote == null ? null : agreementNote.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }
}