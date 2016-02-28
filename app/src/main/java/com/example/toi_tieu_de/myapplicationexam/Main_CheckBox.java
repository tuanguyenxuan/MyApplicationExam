package com.example.toi_tieu_de.myapplicationexam;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class Main_CheckBox extends Activity {

    EditText editName, editCMND, editInforBoSung;
    RadioGroup rgBangCap;
    RadioButton rbTrungCap, rbCaoDang, rbDaiHoc;
    CheckBox chkDocBao, chkDocSach, chkDocCode;
    Button btnGui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_radiobutton);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        btnGui = (Button) findViewById(R.id.btnGui);
        btnGui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkInfor();

                String s = getInfor();
            }
        });
    }

    public String getInfor() {
        String infor = "";
        infor = getTextName()+"\n"+getTextCMND()+"\n"+getTextBangCap()+"\n"+getTextSoThich()
        +"\n --------------------------\n"+getTextInforBoSung()+"\n----------------------+\n";
        final AlertDialog.Builder alert_build = new AlertDialog.Builder(this);
        alert_build.setTitle("Thong tin ca nhan");
        alert_build.setMessage(infor);
        alert_build.setPositiveButton("Dong", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
        AlertDialog alert = alert_build.create();
        alert.show();
        return infor;
    }

    public String getTextName() {
        String textname = "";
        editName = (EditText) findViewById(R.id.editName);
        textname = editName.getText().toString();
        return textname;
    }
    public String getTextSoThich(){
        String text_sothich = "";
        chkDocSach = (CheckBox)findViewById(R.id.chkDocSach);
        chkDocBao = (CheckBox)findViewById(R.id.chkDocBao);
        chkDocCode =(CheckBox)findViewById(R.id.chkDocCode);
        if (chkDocSach.isChecked()) {
            text_sothich = chkDocSach.getText().toString() + " - ";
        } else if (chkDocBao.isChecked()) {
            text_sothich = text_sothich + chkDocBao.getText().toString() + " - ";
        } else if (chkDocCode.isChecked()) {
            text_sothich = text_sothich+ chkDocCode.getText().toString();
        }
        return text_sothich;
    }
    public String getTextInforBoSung(){
        String text_infor = "";
        editInforBoSung =(EditText)findViewById(R.id.editInforBoSung);
        text_infor = editInforBoSung.getText().toString();
        return text_infor;
    }
    public String getTextBangCap(){
        String textBangCap = "";
        rgBangCap = (RadioGroup)findViewById(R.id.rgBangCap);
        rbTrungCap = (RadioButton)findViewById(R.id.rbTrungCap);
        rbCaoDang =(RadioButton)findViewById(R.id.rbCaoDang);
        rbDaiHoc=(RadioButton)findViewById(R.id.rbDaiHoc);
        int a = rgBangCap.getCheckedRadioButtonId();
        if (a == R.id.rbTrungCap) {
            textBangCap = rbTrungCap.getText().toString();
        } else if (a == R.id.rbCaoDang) {
            textBangCap = rbCaoDang.getText().toString();
        }else {
            textBangCap = rbDaiHoc.getText().toString();
        }

        return  textBangCap;
    }

    public String getTextCMND() {
        String textCMND ="";
        editCMND = (EditText)findViewById(R.id.editCMND);
        textCMND = editCMND.getText().toString();
        return textCMND;
    }

    public void checkInfor() {
        checkName();
        checkCmnd();
        checkSoThich();
    }


    public boolean checkSoThich() {
        //it nhat 1 so thich
        boolean check_sothich = false;
        chkDocBao = (CheckBox) findViewById(R.id.chkDocBao);
        chkDocSach = (CheckBox) findViewById(R.id.chkDocSach);
        chkDocCode = (CheckBox) findViewById(R.id.chkDocCode);

        if (chkDocCode.isChecked() || chkDocSach.isChecked() || chkDocBao.isChecked()) {
            check_sothich = true;
        } else {
            check_sothich = false;
            Toast.makeText(this, "Cmnd phai co 9 so", Toast.LENGTH_LONG).show();
        }

        return check_sothich;
    }

    public boolean checkCmnd() {
        boolean check_cmnd = false;
        editCMND = (EditText) findViewById(R.id.editCMND);
        editCMND.setInputType(InputType.TYPE_CLASS_NUMBER);
        //editCMND.setText("3245678");///test
        String cmnd = editCMND.getText().toString();
        cmnd = cmnd.trim();
        if (cmnd.length() != 9) {
            check_cmnd = false;
            Toast.makeText(this, "Kiem tra lai cmnd, yeu cau cnt du 9 so", Toast.LENGTH_LONG).show();
        } else check_cmnd = true;

        return check_cmnd;
    }

    public boolean checkName() {
        boolean check_name = false;
        editName = (EditText) findViewById(R.id.editName);
        // editName.setText(" Tu "); // test
        String s = editName.getText() + "";
        s = s.trim();
        if (s.isEmpty()) {
            Toast.makeText(Main_CheckBox.this, "Ten khong duoc de trong", Toast.LENGTH_LONG).show();
            check_name = false;
        } else if (s.length() < 3) {
            Toast.makeText(Main_CheckBox.this, "Ten phai lon hon bang 3 ki tu", Toast.LENGTH_LONG).show();
            check_name = false;
        } else check_name = true;
        return check_name;
    }
}
