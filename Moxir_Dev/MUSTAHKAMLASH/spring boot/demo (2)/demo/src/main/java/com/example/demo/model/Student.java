package com.example.demo.model;
    public class Student {
        private String name;
        private String lastname;
        private int id;

        public Student(String name, String lastname, int id) {
            this.name = name;
            this.lastname = lastname;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

    }