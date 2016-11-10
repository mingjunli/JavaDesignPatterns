package com.anly.designpattern.builder;

/**
 * Created by mingjun on 16/11/10.
 */
public class HotDryNoodles {

    private boolean addShallot;
    private boolean addParsley;
    private boolean addChili;
    private boolean addSauerkraut;

    public HotDryNoodles(boolean shallot, boolean parsley, boolean chili, boolean sauerkraut) {
        this.addShallot = shallot;
        this.addParsley = parsley;
        this.addChili = chili;
        this.addSauerkraut = sauerkraut;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("A bowl of hot-dry noodles has:");

        if (this.addShallot) {
            builder.append("葱花.");
        }

        if (this.addParsley) {
            builder.append("香菜.");
        }

        if (this.addChili) {
            builder.append("辣椒.");
        }

        if (this.addSauerkraut) {
            builder.append("酸菜.");
        }

        return builder.toString();
    }
}
