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

package com.ultimate.ten.activities;

/**
 * Created by Lesley on 4/15/2015.
 */

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.ultimate.ten.R;
import com.ultimate.ten.fragments.BaseFragment;
import com.ultimate.ten.fragments.NativeCameraFragment;

public class PhotoGalleryActivity extends Activity {
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.horizontal_photo_gallery);
        final FragmentManager fragmentManager = getFragmentManager();
        final SharedPreferences mPrefs = this.getSharedPreferences("pref", Context.MODE_PRIVATE);

        // Set the image view
        final Button photo_one = (Button) findViewById(R.id.photo_one);
        photo_one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String encodedImage = mPrefs.getString("photo2", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView1);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_two = (Button) findViewById(R.id.photo_two);
        photo_two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String encodedImage = mPrefs.getString("photo2", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView2);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_three = (Button) findViewById(R.id.photo_three);
        photo_three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo3", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView3);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_four = (Button) findViewById(R.id.photo_four);
        photo_four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo4", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView4);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_five = (Button) findViewById(R.id.photo_five);
        photo_five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo5", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView5);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_six = (Button) findViewById(R.id.photo_six);
        photo_six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo6", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView6);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_seven = (Button) findViewById(R.id.photo_seven);
        photo_seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo7", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView7);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_eight = (Button) findViewById(R.id.photo_eight);
        photo_eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo8", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView8);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_nine = (Button) findViewById(R.id.photo_nine);
        photo_nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo9", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView9);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });

        final Button photo_ten = (Button) findViewById(R.id.photo_ten);
        photo_ten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String encodedImage = mPrefs.getString("photo10", "");
                if (encodedImage != "") {
                    byte[] b = Base64.decode(encodedImage, Base64.DEFAULT);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);

                    mImageView = (ImageView)findViewById(R.id.imageView10);
                    if (checkPhone() == true) {
                        Matrix matrix = new Matrix();
                        matrix.postRotate(90);
                        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        mImageView.setImageBitmap(rotatedBitmap);
                    } else {
                        mImageView.setImageBitmap(bitmap);
                    }
                } else {
                    BaseFragment targetFragment = NativeCameraFragment.newInstance(1);
                    fragmentManager.beginTransaction().replace(R.id.container, targetFragment).commit();
                }
            }
        });
    }

    private boolean checkPhone() {
        String PhoneModel = android.os.Build.MODEL;
        String manufacturer = Build.MANUFACTURER;
        if (manufacturer.equalsIgnoreCase("HTC")) {
            return true;
        }
        return false;
    }
}
