package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.Item;

public class ItemRoom implements Room {

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Item item;
    private int north;
    private int west;
    private int south;
    private int east;
    private int x;
    private int y;

    public ItemRoom(String roomInfo, Item item, int north, int west, int south, int east, int x, int y) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setItem(item);
        setNorth(north);
        setWest(west);
        setSouth(south);
        setEast(east);
        setX(x);
        setY(y);

    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

    public void setHasBeenCompleted(boolean trueOrFalse) {
        this.hasBeenCompleted = trueOrFalse;
    }

    public boolean getHasBeenCompleted() {
        return this.hasBeenCompleted;
    }

    @Override
    public void setNorth(int north) {
        this.north = north;
    }

    @Override
    public int getNorth() {
        return north;
    }

    @Override
    public void setWest(int west) {
        this.west = west;
    }

    @Override
    public int getWest() {
        return west;
    }

    @Override
    public void setSouth(int south) {
        this.south = south;
    }

    @Override
    public int getSouth() {
        return south;
    }

    @Override
    public void setEast(int east) {
        this.east = east;
    }

    @Override
    public int getEast() {
        return east;
    }


    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }



}