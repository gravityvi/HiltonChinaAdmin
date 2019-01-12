package com.example.ravi.hiltonadmin1;

import android.os.Parcel;
import android.os.Parcelable;

public class    Items implements Parcelable {


    private String ImageUrl;
    private String ItemName;
    private String ItemCategory;
    private String ItemNumber;
    private String ItemDescription;
    private String ItemPrice;
    private String ItemId;

    /**getters and setters***/


    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getItemCategory() {
        return ItemCategory;
    }

    public void setItemCategory(String itemCategory) {
        ItemCategory = itemCategory;
    }

    public String getItemId() {
        return ItemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public String getItemPrice() {
        return ItemPrice;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    Items(String ItemId, String ItemName, String ItemCategory, String ItemNumber, String ItemDescription, String ItemPrice, String ImageUrl)
    {
        this.ImageUrl=ImageUrl;
        this.ItemId=ItemId;
        this.ItemName=ItemName;
        this.ItemCategory=ItemCategory;
        this.ItemDescription=ItemDescription;
        this.ItemNumber=ItemNumber;

        this.ItemPrice= ItemPrice;

    }

    public Items(Parcel in)
    {
        this.ItemId=in.readString();
        this.ItemName=in.readString();
        this.ItemCategory=in.readString();
        this.ItemNumber=in.readString();
        this.ItemPrice=in.readString();
        this.ItemDescription=in.readString();
        this.ImageUrl=in.readString();
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(ItemId);
        parcel.writeString(ItemName);
        parcel.writeString(ItemCategory);
        parcel.writeString(ItemNumber);
        parcel.writeString(ItemPrice);
        parcel.writeString(ItemDescription);
        parcel.writeString(ImageUrl);
    }

    public static final Parcelable.Creator<Items> CREATOR = new Creator<Items>() {
        @Override
        public Items createFromParcel(Parcel source) {
            return  new Items(source);
        }

        @Override
        public Items[] newArray(int size) {
            return new Items[size];
        }
    };
}
