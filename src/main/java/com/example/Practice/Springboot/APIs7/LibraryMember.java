package com.example.Practice.Springboot.APIs7;

public class LibraryMember {

    private  String memberId;
    private String fullName;
    private String membershipType;

    // Constructor

    public LibraryMember(String memberId, String fullName, String membershipType) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.membershipType = membershipType;
    }

    // Getter

    public String getFullName() {
        return fullName;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMembershipType() {
        return membershipType;
    }
}
