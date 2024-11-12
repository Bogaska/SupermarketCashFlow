package supermarket;

public class Supplier {
    private String supplierName;
    private String contactInfo;

    public Supplier(String supplierName, String contactInfo) {
        this.supplierName = supplierName;
        this.contactInfo = contactInfo;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
