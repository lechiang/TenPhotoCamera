/*
 * Copyright (c) 2015 Rex St. John on behalf of AirPair.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.ultimate.ten.fragments;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.ultimate.ten.R;
import com.ultimate.ten.activities.PhotoGalleryActivity;

/**
 * Created by Lesley on 4/15/2015.
 */
public class PhotoGalleryFragment extends BaseFragment implements Button.OnClickListener{
    private ImageView imgView1;
    private ImageView imgView2;
    private ImageView imgView3;
    private ImageView imgView4;
    private ImageView imgView5;
    private ImageView imgView6;
    private ImageView imgView7;
    private ImageView imgView8;
    private ImageView imgView9;
    private ImageView imgView10;
    Button photo1;
    Button photo2;
    Button photo3;
    Button photo4;
    Button photo5;
    Button photo6;
    Button photo7;
    Button photo8;
    Button photo9;
    Button photo10;

    public static PhotoGalleryFragment newInstance(int sectionNumber) {
        PhotoGalleryFragment fragment = new PhotoGalleryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view =  null;
        view = inflater.inflate(R.layout.horizontal_photo_gallery, container, false);
        SharedPreferences mPrefs = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);

        // Set the image view
        photo1 = (Button)view.findViewById(R.id.photo_one);
        photo1.setOnClickListener(this);
        imgView1 = (ImageView)view.findViewById(R.id.imageView1);
        String image1 = mPrefs.getString("photo", "");
        setPhoto(imgView1, image1, "photo", view, photo1);

        photo2 = (Button)view.findViewById(R.id.photo_two);
        photo2.setOnClickListener(this);
        imgView2 = (ImageView)view.findViewById(R.id.imageView2);
        String image2 = mPrefs.getString("photo2", "");
        setPhoto(imgView2, image2, "photo2", view, photo2);

        photo3 = (Button)view.findViewById(R.id.photo_three);
        photo3.setOnClickListener(this);
        imgView3 = (ImageView)view.findViewById(R.id.imageView3);
        String image3 = mPrefs.getString("photo3", "");
        setPhoto(imgView3, image3, "photo3", view, photo3);

        photo4 = (Button)view.findViewById(R.id.photo_four);
        photo4.setOnClickListener(this);
        imgView4 = (ImageView)view.findViewById(R.id.imageView4);
        String image4 = mPrefs.getString("photo4", "");
        setPhoto(imgView4, image4, "photo4", view, photo4);

        photo5 = (Button)view.findViewById(R.id.photo_five);
        photo5.setOnClickListener(this);
        imgView5 = (ImageView)view.findViewById(R.id.imageView5);
        String image5 = mPrefs.getString("photo5", "");
        setPhoto(imgView5, image5, "photo5", view, photo5);

        photo6 = (Button)view.findViewById(R.id.photo_six);
        photo6.setOnClickListener(this);
        imgView6 = (ImageView)view.findViewById(R.id.imageView6);
        String image6 = mPrefs.getString("photo6", "");
        setPhoto(imgView6, image6, "photo6", view, photo6);

        photo7 = (Button)view.findViewById(R.id.photo_seven);
        photo7.setOnClickListener(this);
        imgView7 = (ImageView)view.findViewById(R.id.imageView7);
        String image7 = mPrefs.getString("photo7", "");
        setPhoto(imgView7, image7, "photo7", view, photo7);

        photo8 = (Button)view.findViewById(R.id.photo_eight);
        photo8.setOnClickListener(this);
        imgView8 = (ImageView)view.findViewById(R.id.imageView8);
        String image8 = mPrefs.getString("photo8", "");
        setPhoto(imgView8, image8, "photo8", view, photo8);

        photo9 = (Button)view.findViewById(R.id.photo_nine);
        photo9.setOnClickListener(this);
        imgView9 = (ImageView)view.findViewById(R.id.imageView9);
        String image9 = mPrefs.getString("photo9", "");
        setPhoto(imgView9, image9, "photo9", view, photo9);

        photo10 = (Button)view.findViewById(R.id.photo_ten);
        photo10.setOnClickListener(this);
        imgView10 = (ImageView)view.findViewById(R.id.imageView10);
        String image10 = mPrefs.getString("photo10", "");
        setPhoto(imgView10, image10, "photo10", view, photo10);

        return view;
    }

    @Override
    public void onClick(View v) {
        SharedPreferences mPrefs = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);
        FragmentManager fragmentManager = getFragmentManager();

        switch (v.getId()) {
            case (R.id.photo_one):
                BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                break;

            case (R.id.photo_two):
                BaseFragment targetFragment2 = NCFrag2.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment2).commit();
                break;

            case (R.id.photo_three):
                BaseFragment targetFragment3 = NCFrag3.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment3).commit();
                break;

            case (R.id.photo_four):
                BaseFragment targetFragment4 = NCFrag4.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment4).commit();
                break;

            case (R.id.photo_five):
                BaseFragment targetFragment5 = NCFrag5.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment5).commit();
                break;

            case (R.id.photo_six):
                BaseFragment targetFragment6 = NCFrag6.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment6).commit();
                break;

            case (R.id.photo_seven):
                BaseFragment targetFragment7 = NCFrag7.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment7).commit();
                break;

            case (R.id.photo_eight):
                BaseFragment targetFragment8 = NCFrag8.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment8).commit();
                break;

            case (R.id.photo_nine):
                BaseFragment targetFragment9 = NCFrag9.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment9).commit();
                break;

            case (R.id.photo_ten):
                BaseFragment targetFragment10 = NCFrag10.newInstance(1);
                fragmentManager.beginTransaction().replace(R.id.container, targetFragment10).commit();
                break;
        }
    }

    private boolean checkPhone() {
        String PhoneModel = android.os.Build.MODEL;
        String manufacturer = Build.MANUFACTURER;
        if (manufacturer.equalsIgnoreCase("HTC")) {
            return true;
        }
        return false;
    }

    private void setPhoto(ImageView mImageView, String image, String photo, View v, Button button) {
        SharedPreferences mPrefs = this.getActivity().getSharedPreferences("pref", Context.MODE_PRIVATE);

        if (!image.equalsIgnoreCase("")) {
            String encodedImage = mPrefs.getString(photo, "");
            byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

            if (checkPhone() == true) {
                Matrix matrix = new Matrix();
                matrix.postRotate(90);
                Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap , 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                mImageView.setImageBitmap(rotatedBitmap);
            } else {
                mImageView.setImageBitmap(bitmap);
            }
            button.setClickable(false);
        }
    }
}
