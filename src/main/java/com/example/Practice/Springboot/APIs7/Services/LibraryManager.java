package com.example.Practice.Springboot.APIs7.Services;

import com.example.Practice.Springboot.APIs7.Entities.LibraryMember;

import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void initializeMembers() {
        members.add(new LibraryMember("100", "Ahmed", "Standard"));
        members.add(new LibraryMember("101", "Ali", "Premium"));
        members.add(new LibraryMember("102", "Salim", "Premium"));
    }

    public void addMember(LibraryMember member) {
        members.add(member);

    }

    public void displayMembers() {
        for (LibraryMember member : members) {
            System.out.println(member.getMemberId() + "->" + member.getFullName() + "->" + member.getMembershipType());
        }
    }

    public boolean deleteMemberById(String memberId) {

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId().equalsIgnoreCase(memberId)) {
                members.remove(i);
                return true;
            }
        }
        return false;
    }
}

