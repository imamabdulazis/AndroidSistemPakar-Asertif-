package com.example.assertif.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.assertif.util.Question;

import java.util.ArrayList;
import java.util.List;

import static com.example.assertif.data.QuizContract.MovieEntry.KEY_ANSWER;
import static com.example.assertif.data.QuizContract.MovieEntry.KEY_ID;
import static com.example.assertif.data.QuizContract.MovieEntry.KEY_OPTA;
import static com.example.assertif.data.QuizContract.MovieEntry.KEY_OPTB;
import static com.example.assertif.data.QuizContract.MovieEntry.KEY_OPTC;
import static com.example.assertif.data.QuizContract.MovieEntry.KEY_OPTD;
import static com.example.assertif.data.QuizContract.MovieEntry.KEY_QUES;
import static com.example.assertif.data.QuizContract.MovieEntry.TABLE_QUEST;

public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "NomoPhobiaQuiz";

    private SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + KEY_QUES + " TEXT, "
                + KEY_ANSWER + " TEXT, "
                + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, "
                + KEY_OPTC + " TEXT, "
                + KEY_OPTD + " TEXT)";
        db.execSQL(sql);
        addQuestions();
        //db.close();
    }

    private void addQuestions() {
       Question q1 = new Question("Saya mendengarkan dengan penuh perhatian ketika teman saya sedang berbicara?", "Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q1);
        Question q2 = new Question("Saya memberikan kesempatan kepada teman saya untuk menyampaikan pendapatnya?", "Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q2);
        Question q3 = new Question("Saya sering memotong pembicaraan ketika teman saya berbicara?", "Sangat Tidak Sesuai", "Tidak Sesuai","Sesuai","Sangat Sesuai","?");
        this.addQuestion(q3);
        Question q4 = new Question("Saya menerima kekurangan teman saya?", "Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q4);
        Question q5 = new Question("Saya merasa tidak mampu menjaga rahasia teman?", "Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q5);
        Question q6= new Question("Saya berusaha tersenyum ketika saya bertemu dengan orang yang baru saya kenal?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q6);
        Question q7= new Question("Saya memperkenalkan diri terlebih dahulu kepada orang yang baru saya kenal?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q7);
        Question q8= new Question("Saya merasa minder untuk memulai percakapan ketika bertemu dengan orang  baru?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q8);
        Question q9= new Question("Saya berani menentukan pilihan terhadap sesuatu tanpa merasa cemas?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q9);
        Question q10= new Question(" Saya mempertahankan pendapat yang saya anggap benar ketika berdiskusi?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q10);
        Question q11= new Question("Saya merasa takut salah ketika hendak mengambil keputusan?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q11);
        Question q12= new Question("Saya meminta bantuan teman saya jika saya mengalami kesulitan dalam mengerjakan tugas?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q12);
        Question q13= new Question("Saya cenderung melakukan sesuatu tanpa merencanakannya terlebih dahulu?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q13);
        Question q14= new Question("Saya sulit menolak ajakan teman untuk bermain padahal saya harus mengerjakan PR?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q14);
        Question q15= new Question("Saya dapat menerima kritikan dari teman dengan senang hati?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q15);
        Question q16= new Question("Saya senang apabila ada teman yang memberi masukan kepada saya?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q16);
        Question q17= new Question("Saya berani berkata tidak ketika diajak menyontek? ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q17);
        Question q18= new Question("Saya merasa tidak enak untuk menyampaikan pendapat ketika tidak sependapat dengan teman?","Sangat Tidak Sesui", "Tidak Sesui", "Sesui", "Sangat Sesui","?");
        this.addQuestion(q18);
        Question q19= new Question("Saya takut mengakui kesalahan?","Sangat Tidak Sesui", "Tidak Sesui", "Sesui", "Sangat Sesui","?");
        this.addQuestion(q19);
        Question q20= new Question("Saya mampu mengungkapkan kekecewaan saya terhadap teman saya  tanpa merendahkannya?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q20);
        Question q21= new Question("Saya berani mengungkapkan pendapat saya ketika berdiskusi  dalam kelompok?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q21);
        Question q22= new Question("saya merasa percaya diri untuk menyampaikan ide saya di depan umum?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q22);
        Question q23= new Question("KSaya merasa sungkan untuk menyampaikan pendapaat saya sebelum diminta untuk  menyampaikannya?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q23);
        Question q24= new Question("Saat diskusi saya memberikan kesempatan kepada orang lain untuk berbicara?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q24);
        Question q25= new Question("Saya sulit menghargai pendapat orang lain ketika tidak sependapat dengan saya?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q25);
        Question q26= new Question("Saya menyampaikan pendapat tanpa menyinggung perasaan? ","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q26);
        Question q27= new Question("Saya merasa tidak enak ketika hendak memberikan saran atau  kritikan terhadap teman?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q27);
        Question q28= new Question("Saya menghargai setiap keputusan yang dipilih oleh teman saya?","Sangat Sesuai", "Sesuai", "Tidak Sesuai", "Sangat Tidak Sesuai","?");
        this.addQuestion(q28);
        Question q29= new Question("Saya merasa kesal ketika teman saya tidak menuruti keinginan saya?","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q29);
        Question q30= new Question("SSaya berusaha agar teman saya menerima apapun pendapat saya? ","Sangat Tidak Sesuai", "Tidak Sesuai", "Sesuai", "Sangat Sesuai","?");
        this.addQuestion(q30);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        onCreate(db);
    }

    // Adding new question
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getQUESTION());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(KEY_OPTA, quest.getOPTA());
        values.put(KEY_OPTB, quest.getOPTB());
        values.put(KEY_OPTC, quest.getOPTC());
        values.put(KEY_OPTD, quest.getOPTD());
        //Inserting Row
        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {
        List<Question> quesList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase = this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setQUESTION(cursor.getString(1));
                quest.setANSWER(cursor.getString(2));
                quest.setOPTA(cursor.getString(3));
                quest.setOPTB(cursor.getString(4));
                quest.setOPTC(cursor.getString(5));
                quest.setOPTD(cursor.getString(6));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // return quest list
        return quesList;
    }

    public int rowcount() {
        int row = 0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();
        return row;
    }
}
