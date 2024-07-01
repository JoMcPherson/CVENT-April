package org.example;

public class Reservation {

    private String roomType;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (this.roomType.equals("double")) {
            this.price = 124;
        }
        else{
            this.price = 139;
        }
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getTotal() {
        double sum = this.price*this.nights;
        if (this.isWeekend) {
            sum = sum*1.1;
        }
        return sum;
    }


    private double price;
    private int nights;
    private boolean isWeekend;
    private double total;

    public Reservation(String roomType, int nights, boolean isWeekend) {
        this.roomType = roomType;
        this.nights = nights;
        this.isWeekend = isWeekend;
    }
}
