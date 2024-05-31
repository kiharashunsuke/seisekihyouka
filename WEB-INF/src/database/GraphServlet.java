package database;

import java.awt.BasicStroke;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraphServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String forwardURL = null;

        //保存元(PCによって保存元違う可能性あり)
        //String sourceFilePath1 = "C:\\pleiades\\tomcat\\8\\sample113.png";
        String sourceFilePath_japanese = "C:\\pleiades\\tomcat\\8\\sample_japanese.png";
        String sourceFilePath_math = "C:\\pleiades\\tomcat\\8\\sample_math.png";
        String sourceFilePath_english = "C:\\pleiades\\tomcat\\8\\sample_english.png";
        String sourceFilePath_science = "C:\\pleiades\\tomcat\\8\\sample_science.png";
        String sourceFilePath_social = "C:\\pleiades\\tomcat\\8\\sample_social.png";
        String sourceFilePath_goukei = "C:\\pleiades\\tomcat\\8\\sample_goukei.png";

        //移動先(tomcatプロジェクトがあるところに移動させる
        String destinationDirectory = "C:\\Users\\pleiades\\workspace\\seisekihyouka";

        //String absolutePath1 = "C:\\pleiades\\workspace\\seisekihyouka\\sample113.png";
        String absolutePath_japanese = "C:\\Users\\pleiades\\workspace\\seisekihyouka\\sample_japanese.png";
        String absolutePath_math = "C:\\Users\\pleiades\\workspace\\seisekihyouka\\sample_math.png";
        String absolutePath_english = "C:\\Users\\pleiades\\workspace\\seisekihyouka\\sample_english.png";
        String absolutePath_science = "C:\\Users\\pleiades\\workspace\\seisekihyouka\\sample_science.png";
        String absolutePath_social = "C:\\Users\\pleiades\\workspace\\seisekihyouka\\sample_social.png";
        String absolutePath_goukei = "C:\\Users\\pleiades\\workspace\\seisekihyouka\\sample_goukei.png";

        try {
            List<CustomerBean> customerList = CustomerDAO.getCustomerList();
			/*List<StudentBean> studentList = CustomerDAO.getStudentList();*/

            int number = 0;

            int studentNumber = 0;
            int starttest = 0;//てすと名選択。0は1年1学期中間テスト
            int endtest = 0;//てすと名選択
            number = Integer.parseInt(request.getParameter("number"));

            studentNumber = number -1;
//            System.out.println(studentNumber);
            starttest = Integer.parseInt(request.getParameter("starttest"));
			System.out.println(starttest);
			endtest = Integer.parseInt(request.getParameter("endtest"));;
			System.out.println(endtest);

            request.setAttribute("customerList", customerList);
			/*request.setAttribute("StudentList", StudentList);*/
            request.setAttribute("studentNumber", studentNumber);

            forwardURL = "/database/Graphresult.jsp";

//---------------------------------------------------------------------------------------------------------//



            CustomerBean cbean = customerList.get(studentNumber);
			/*StudentrBean sbean = studentList.get(studentNumber);*/
            List<Double> dataList_ave = new ArrayList<>();
//            //StudentBean sbean1 = studentList.get(studentNumber);
            for(int j = 0; j < 30; j++ ) {

                // (1)データセットの作成
                CustomerBean cbean_ave = customerList.get(j);
				/*StudentBean sbean_ave = studentList.get(j);*/

                 double value_ave;
                 value_ave = cbean_ave.getTyukan_1_1_japanese();//0
                dataList_ave.add(value_ave);
                value_ave = cbean_ave.getKimatu_1_1_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_1_2_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_1_2_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_1_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_1_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_2_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_2_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_1_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_1_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_2_japanese();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_2_japanese();//11
                dataList_ave.add(value_ave);

                value_ave = cbean_ave.getTyukan_1_1_math();//12
                dataList_ave.add(value_ave);
                value_ave = cbean_ave.getKimatu_1_1_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_1_2_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_1_2_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_1_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_1_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_2_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_2_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_1_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_1_math();
                dataList_ave.add(value_ave);
                value_ave =cbean_ave.getTyukan_3_2_math();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_2_math();//23
                dataList_ave.add(value_ave);

                value_ave = cbean_ave.getTyukan_1_1_english();//24
                dataList_ave.add(value_ave);
                value_ave = cbean_ave.getKimatu_1_1_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_1_2_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_1_2_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_1_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_1_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_2_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_2_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_1_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_1_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_2_english();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_2_english();//35
                dataList_ave.add(value_ave);

                value_ave = cbean_ave.getTyukan_1_1_science();//36
                dataList_ave.add(value_ave);
                value_ave = cbean_ave.getKimatu_1_1_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_1_2_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_1_2_scoience();//scoienceスペルミス
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_1_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_1_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_2_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_2_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_1_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_1_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_2_science();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_2_science();//47
                dataList_ave.add(value_ave);

                value_ave = cbean_ave.getTyukan_1_1_social();//48
                dataList_ave.add(value_ave);
                value_ave = cbean_ave.getKimatu_1_1_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_1_2_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_1_2_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_1_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_1_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_2_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_2_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_1_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_1_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_2_social();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_2_social();//59
                dataList_ave.add(value_ave);

                value_ave = cbean_ave.getTyukan_1_1_goukei();//60
                dataList_ave.add(value_ave);
                value_ave = cbean_ave.getKimatu_1_1_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_1_2_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_1_2_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_1_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_1_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_2_2_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_2_2_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_1_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_1_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getTyukan_3_2_goukei();
                dataList_ave.add(value_ave);
                value_ave= cbean_ave.getKimatu_3_2_goukei();//71
                dataList_ave.add(value_ave);

            }
            System.out.println("dataList_ave"+dataList_ave);
            System.out.println("dataList_ave.size()"+dataList_ave.size());

            List<Double> dataList_ave_japanese = new ArrayList<>();
            for(int i = starttest; i <= endtest; i++) {
            	for(int u = 0; u < 30; u++) {
            		dataList_ave_japanese.add(dataList_ave.get(i+72*u));
            	}
            }
            List<Double> dataList_ave_math = new ArrayList<>();
            for(int i = starttest; i <= endtest; i++) {
            	for(int u = 0; u < 30; u++) {
            		dataList_ave_math.add(dataList_ave.get(i+12+72*u));
            	}
            }
            List<Double> dataList_ave_english = new ArrayList<>();
            for(int i = starttest; i <= endtest; i++) {
            	for(int u = 0; u < 30; u++) {
            		dataList_ave_english.add(dataList_ave.get(i+24+72*u));
            	}
            }
            List<Double> dataList_ave_science = new ArrayList<>();
            for(int i = starttest; i <= endtest; i++) {
            	for(int u = 0; u < 30; u++) {
            		dataList_ave_science.add(dataList_ave.get(i+36+72*u));
            	}
            }
            List<Double> dataList_ave_social = new ArrayList<>();
            for(int i = starttest; i <= endtest; i++) {
            	for(int u = 0; u < 30; u++) {
            		dataList_ave_social.add(dataList_ave.get(i+48+72*u));
            	}
            }
            List<Double> dataList_ave_goukei = new ArrayList<>();
            for(int i = starttest; i <= endtest; i++) {
            	for(int u = 0; u < 30; u++) {
            		dataList_ave_goukei.add(dataList_ave.get(i+60+72*u));
            	}
            }


            System.out.println("dataList_ave_japanese"+dataList_ave_japanese);
            System.out.println("dataList_ave_japanese.size():"+dataList_ave_japanese.size());
            System.out.println("dataList_ave_math"+dataList_ave_math);
            System.out.println("dataList_ave_math.size()"+dataList_ave_math.size());



//            // ファイルオブジェクトを作成します
            File file_japanese = new File(absolutePath_japanese);
            // ファイルが存在するかチェックし、存在すれば削除します
            if (file_japanese.exists()) {
                if (file_japanese.delete()) {
                    System.out.println("画像ファイルが削除されました: " + absolutePath_japanese);
                } else {
                    System.out.println("画像ファイルの削除に失敗しました: " + absolutePath_japanese);
                }
            } else {
                System.out.println("画像ファイルが見つかりません: " + absolutePath_japanese);
            }

//          // ファイルオブジェクトを作成します
          File file_math = new File(absolutePath_math);
          // ファイルが存在するかチェックし、存在すれば削除します
          if (file_math.exists()) {
              if (file_math.delete()) {
                  System.out.println("画像ファイルが削除されました: " + absolutePath_math);
              } else {
                  System.out.println("画像ファイルの削除に失敗しました: " + absolutePath_math);
              }
          } else {
              System.out.println("画像ファイルが見つかりません: " + absolutePath_math);
          }

//        // ファイルオブジェクトを作成します
        File file_english = new File(absolutePath_english);
        // ファイルが存在するかチェックし、存在すれば削除します
        if (file_english.exists()) {
            if (file_english.delete()) {
                System.out.println("画像ファイルが削除されました: " + absolutePath_english);
            } else {
                System.out.println("画像ファイルの削除に失敗しました: " + absolutePath_english);
            }
        } else {
            System.out.println("画像ファイルが見つかりません: " + absolutePath_english);
        }

//      // ファイルオブジェクトを作成します
      File file_science = new File(absolutePath_science);
      // ファイルが存在するかチェックし、存在すれば削除します
      if (file_science.exists()) {
          if (file_science.delete()) {
              System.out.println("画像ファイルが削除されました: " + absolutePath_science);
          } else {
              System.out.println("画像ファイルの削除に失敗しました: " + absolutePath_science);
          }
      } else {
          System.out.println("画像ファイルが見つかりません: " + absolutePath_science);
      }

//    // ファイルオブジェクトを作成します
    File file_social = new File(absolutePath_social);
    // ファイルが存在するかチェックし、存在すれば削除します
    if (file_social.exists()) {
        if (file_social.delete()) {
            System.out.println("画像ファイルが削除されました: " + absolutePath_social);
        } else {
            System.out.println("画像ファイルの削除に失敗しました: " + absolutePath_social);
        }
    } else {
        System.out.println("画像ファイルが見つかりません: " + absolutePath_social);
    }

//  // ファイルオブジェクトを作成します
  File file_goukei = new File(absolutePath_goukei);
  // ファイルが存在するかチェックし、存在すれば削除します
  if (file_goukei.exists()) {
      if (file_goukei.delete()) {
          System.out.println("画像ファイルが削除されました: " + absolutePath_goukei);
      } else {
          System.out.println("画像ファイルの削除に失敗しました: " + absolutePath_goukei);
      }
  } else {
      System.out.println("画像ファイルが見つかりません: " + absolutePath_goukei);
  }
            // 文字化け
            ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());


//            // 画像の生成+保存
            int width = 700; // 画像の幅
            int height = 450; // 画像の高さ





           // データを格納する配列リスト
           List<Double> dataList = new ArrayList<>();
          // (1)データセットの作成
           double value;
           value = cbean.getTyukan_1_1_japanese();//0
          dataList.add(value);
          value = cbean.getKimatu_1_1_japanese();
          dataList.add(value);
          value= cbean.getTyukan_1_2_japanese();
          dataList.add(value);
          value= cbean.getKimatu_1_2_japanese();
          dataList.add(value);
          value= cbean.getTyukan_2_1_japanese();
          dataList.add(value);
          value= cbean.getKimatu_2_1_japanese();
          dataList.add(value);
          value= cbean.getTyukan_2_2_japanese();
          dataList.add(value);
          value= cbean.getKimatu_2_2_japanese();
          dataList.add(value);
          value= cbean.getTyukan_3_1_japanese();
          dataList.add(value);
          value= cbean.getKimatu_3_1_japanese();
          dataList.add(value);
          value= cbean.getTyukan_3_2_japanese();
          dataList.add(value);
          value= cbean.getKimatu_3_2_japanese();//11
          dataList.add(value);

          value = cbean.getTyukan_1_1_math();//12
          dataList.add(value);
          value = cbean.getKimatu_1_1_math();
          dataList.add(value);
          value= cbean.getTyukan_1_2_math();
          dataList.add(value);
          value= cbean.getKimatu_1_2_math();
          dataList.add(value);
          value= cbean.getTyukan_2_1_math();
          dataList.add(value);
          value= cbean.getKimatu_2_1_math();
          dataList.add(value);
          value= cbean.getTyukan_2_2_math();
          dataList.add(value);
          value= cbean.getKimatu_2_2_math();
          dataList.add(value);
          value= cbean.getTyukan_3_1_math();
          dataList.add(value);
          value= cbean.getKimatu_3_1_math();
          dataList.add(value);
          value= cbean.getTyukan_3_2_math();
          dataList.add(value);
          value= cbean.getKimatu_3_2_math();//23
          dataList.add(value);

          value = cbean.getTyukan_1_1_english();//24
          dataList.add(value);
          value = cbean.getKimatu_1_1_english();
          dataList.add(value);
          value= cbean.getTyukan_1_2_english();
          dataList.add(value);
          value= cbean.getKimatu_1_2_english();
          dataList.add(value);
          value= cbean.getTyukan_2_1_english();
          dataList.add(value);
          value= cbean.getKimatu_2_1_english();
          dataList.add(value);
          value= cbean.getTyukan_2_2_english();
          dataList.add(value);
          value= cbean.getKimatu_2_2_english();
          dataList.add(value);
          value= cbean.getTyukan_3_1_english();
          dataList.add(value);
          value= cbean.getKimatu_3_1_english();
          dataList.add(value);
          value= cbean.getTyukan_3_2_english();
          dataList.add(value);
          value= cbean.getKimatu_3_2_english();//35
          dataList.add(value);

          value = cbean.getTyukan_1_1_science();//36
          dataList.add(value);
          value = cbean.getKimatu_1_1_science();
          dataList.add(value);
          value= cbean.getTyukan_1_2_science();
          dataList.add(value);
          value= cbean.getKimatu_1_2_scoience();//scoienceスペルミス
          dataList.add(value);
          value= cbean.getTyukan_2_1_science();
          dataList.add(value);
          value= cbean.getKimatu_2_1_science();
          dataList.add(value);
          value= cbean.getTyukan_2_2_science();
          dataList.add(value);
          value= cbean.getKimatu_2_2_science();
          dataList.add(value);
          value= cbean.getTyukan_3_1_science();
          dataList.add(value);
          value= cbean.getKimatu_3_1_science();
          dataList.add(value);
          value= cbean.getTyukan_3_2_science();
          dataList.add(value);
          value= cbean.getKimatu_3_2_science();//47
          dataList.add(value);

          value = cbean.getTyukan_1_1_social();//48
          dataList.add(value);
          value = cbean.getKimatu_1_1_social();
          dataList.add(value);
          value= cbean.getTyukan_1_2_social();
          dataList.add(value);
          value= cbean.getKimatu_1_2_social();
          dataList.add(value);
          value= cbean.getTyukan_2_1_social();
          dataList.add(value);
          value= cbean.getKimatu_2_1_social();
          dataList.add(value);
          value= cbean.getTyukan_2_2_social();
          dataList.add(value);
          value= cbean.getKimatu_2_2_social();
          dataList.add(value);
          value= cbean.getTyukan_3_1_social();
          dataList.add(value);
          value= cbean.getKimatu_3_1_social();
          dataList.add(value);
          value= cbean.getTyukan_3_2_social();
          dataList.add(value);
          value= cbean.getKimatu_3_2_social();//59
          dataList.add(value);

          value = cbean.getTyukan_1_1_goukei();//60
          dataList.add(value);
          value = cbean.getKimatu_1_1_goukei();
          dataList.add(value);
          value= cbean.getTyukan_1_2_goukei();
          dataList.add(value);
          value= cbean.getKimatu_1_2_goukei();
          dataList.add(value);
          value= cbean.getTyukan_2_1_goukei();
          dataList.add(value);
          value= cbean.getKimatu_2_1_goukei();
          dataList.add(value);
          value= cbean.getTyukan_2_2_goukei();
          dataList.add(value);
          value= cbean.getKimatu_2_2_goukei();
          dataList.add(value);
          value= cbean.getTyukan_3_1_goukei();
          dataList.add(value);
          value= cbean.getKimatu_3_1_goukei();
          dataList.add(value);
          value= cbean.getTyukan_3_2_goukei();
          dataList.add(value);
          value= cbean.getKimatu_3_2_goukei();//71
          dataList.add(value);

          value = cbean.getGakuryokutest_1_japanese();//72
          dataList.add(value);
          value = cbean.getGakuryokutest_2_japanese();
          dataList.add(value);
          value = cbean.getGakuryokutest_3_japanese();
          dataList.add(value);
          value = cbean.getGakuryokutest_math(); // 1が抜けている
          dataList.add(value);
          value = cbean.getGakuryokutest_2_math();
          dataList.add(value);
          value = cbean.getGakuryokutest_3_math();
          dataList.add(value);
          value = cbean.getGakuryokutest_english();
          dataList.add(value);
          value = cbean.getGakuryokutest_2_english();
          dataList.add(value);
          value = cbean.getGakuryokutest_3_english();
          dataList.add(value);
          value = cbean.getGakuryokutest_science();
          dataList.add(value);
          value = cbean.getGakuryokutest_2_science();
          dataList.add(value);
          value = cbean.getGakuryokutest_3_science();
          dataList.add(value);
          value = cbean.getGakuryokutest_social();
          dataList.add(value);
          value = cbean.getGakuryokutest_2_social();
          dataList.add(value);
          value = cbean.getGakuryokutest_3_social();
          dataList.add(value);
          value = cbean.getGakuryokutest_goukei();
          dataList.add(value);
          value = cbean.getGakuryokutest_2_goukei();
          dataList.add(value);
          value = cbean.getGakuryokutest_3_goukei();
          dataList.add(value);

          System.out.println("dataList"+dataList);
          List<Double> dataList_japanese_all = new ArrayList<>();
          DefaultCategoryDataset ds_cat_japanese = new DefaultCategoryDataset();
          for(int k = starttest; k <= endtest; k++) {
        	  switch(k) {
        	  case 0:
        		  ds_cat_japanese.setValue(dataList.get(0), "本人", "中間1年1期");
        		  dataList_japanese_all.add(dataList.get(0));
        		  double sum_j0 = 0;
        		  for(int a = 0; a < 30; a++) {
        			  sum_j0 = sum_j0 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j0/30,"平均", "中間1年1期");
        		  dataList_japanese_all.add(sum_j0/30);
        		  System.out.println("sum_j0/30:"+ sum_j0/30);
        		  break;
        	  case 1:
        		  ds_cat_japanese.setValue(dataList.get(1),  "本人",  "期末1年1期");
        		  dataList_japanese_all.add(dataList.get(1));
        		  double sum_j1 = 0;
        		  for(int a = 30; a < 60; a++) {
        			  sum_j1 = sum_j1 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j1/30,"平均", "期末1年1期");
        		  dataList_japanese_all.add(sum_j1/30);
        		  System.out.println("sum_j1/30:"+ sum_j1/30);
        		  break;
        	  case 2:
        		  ds_cat_japanese.setValue(dataList.get(2),  "本人",  "中間1年2期");
        		  dataList_japanese_all.add(dataList.get(2));
        		  double sum_j2 = 0;
        		  for(int a = 60; a < 90; a++) {
        			  sum_j2 = sum_j2 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j2/30,"平均", "中間1年2期");
        		  dataList_japanese_all.add(sum_j2/30);
        		  System.out.println("sum_j2/30:"+ sum_j2/30);
        		  break;
        	  case 3:
        		  ds_cat_japanese.setValue(dataList.get(3),  "本人",  "期末1年2期");
        		  dataList_japanese_all.add(dataList.get(3));
        		  double sum_j3 = 0;
        		  for(int a = 90; a < 120; a++) {
        			  sum_j3 = sum_j3 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j3/30,"平均", "期末1年2期");
        		  dataList_japanese_all.add(sum_j3/30);
        		  System.out.println("sum_j3/30:"+ sum_j3/30);
        		  break;

        	  case 4:
        		  ds_cat_japanese.setValue(dataList.get(4),  "本人",  "中間2年1期");
        		  dataList_japanese_all.add(dataList.get(4));
        		  double sum_j4 = 0;
        		  for(int a = 120; a < 150; a++) {
        			  sum_j4 = sum_j4 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j4/30,"平均", "中間2年1期");
        		  dataList_japanese_all.add(sum_j4/30);
        		  break;

        	  case 5:
        		  ds_cat_japanese.setValue(dataList.get(5),  "本人",  "期末2年1期");
        		  dataList_japanese_all.add(dataList.get(5));
        		  double sum_j5 = 0;
        		  for(int a = 150; a < 180; a++) {
        			  sum_j5 = sum_j5 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j5/30,"平均", "期末2年1期");
        		  dataList_japanese_all.add(sum_j5/30);
        		  break;
        	  case 6:
        		  ds_cat_japanese.setValue(dataList.get(6),  "本人",  "中間2年2期");
        		  dataList_japanese_all.add(dataList.get(6));
        		  double sum_j6 = 0;
        		  for(int a = 180; a < 210; a++) {
        			  sum_j6 = sum_j6 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j6/30,"平均", "中間2年2期");
        		  dataList_japanese_all.add(sum_j6/30);
        		  break;
        	  case 7:
        		  ds_cat_japanese.setValue(dataList.get(7),  "本人",  "期末2年2期");
        		  dataList_japanese_all.add(dataList.get(7));
        		  double sum_j7 = 0;
        		  for(int a = 210; a < 240; a++) {
        			  sum_j7 = sum_j7 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j7/30,"平均", "期末2年2期");
        		  dataList_japanese_all.add(sum_j7/30);
        		  break;
        	  case 8:
        		  ds_cat_japanese.setValue(dataList.get(8),  "本人",  "中間3年1期");
        		  dataList_japanese_all.add(dataList.get(8));
        		  double sum_j8 = 0;
        		  for(int a = 240; a < 270; a++) {
        			  sum_j8 = sum_j8 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j8/30,"平均", "中間3年1期");
        		  dataList_japanese_all.add(sum_j8/30);
        		  break;
        	  case 9:
        		  ds_cat_japanese.setValue(dataList.get(9),  "本人",  "期末3年1期");
        		  dataList_japanese_all.add(dataList.get(9));
        		  double sum_j9 = 0;
        		  for(int a = 270; a < 300; a++) {
        			  sum_j9 = sum_j9 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j9/30,"平均", "期末3年1期");
        		  dataList_japanese_all.add(sum_j9/30);
        		  break;
        	  case 10:
        		  ds_cat_japanese.setValue(dataList.get(10),  "本人",  "中間3年2期");
        		  dataList_japanese_all.add(dataList.get(10));
        		  double sum_j10 = 0;
        		  for(int a = 300; a < 330; a++) {
        			  sum_j10 = sum_j10 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j10/30,"平均", "中間3年2期");
        		  dataList_japanese_all.add(sum_j10/30);
        		  break;
        	  case 11:
        		  ds_cat_japanese.setValue(dataList.get(11),  "本人",  "期末3年2期");
        		  dataList_japanese_all.add(dataList.get(11));
        		  double sum_j11 = 0;
        		  for(int a = 330; a < 360; a++) {
        			  sum_j11 = sum_j11 + dataList_ave_japanese.get(a);
        	  }
        		  ds_cat_japanese.setValue(sum_j11/30,"平均", "期末3年2期");
        		  dataList_japanese_all.add(sum_j11/30);
        		  break;
        	  }
          }



          System.out.println("dataList_japanese_all"+dataList_japanese_all);

          List<Double> dataList_math_all = new ArrayList<>();
          DefaultCategoryDataset ds_cat_math = new DefaultCategoryDataset();
          for(int m = starttest; m <= endtest; m++) {
        	  switch(m) {
        	  case 0:
        		  ds_cat_math.setValue(dataList.get(12), "本人", "中間1年1期");
        		  dataList_math_all.add(dataList.get(12));
        		  double sum_m0 = 0;
        		  for(int a = 0; a < 30; a++) {
        			  sum_m0 = sum_m0 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m0/30,"平均", "中間1年1期");
        		  dataList_math_all.add(sum_m0/30);
        		  System.out.println("sum_m0/30:"+ sum_m0/30);
        		  break;

        	  case 1:
        		  ds_cat_math.setValue(dataList.get(13),  "本人",  "期末1年1期");
        		  dataList_math_all.add(dataList.get(13));
        		  double sum_m1 = 0;
        		  for(int a = 30; a < 60; a++) {
        			  sum_m1 = sum_m1 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m1/30,"平均", "期末1年1期");
        		  dataList_math_all.add(sum_m1/30);
        		  System.out.println("sum_m1/30:"+ sum_m1/30);
        		  break;
        	  case 2:
        		  ds_cat_math.setValue(dataList.get(14),  "本人",  "中間1年2期");
        		  dataList_math_all.add(dataList.get(14));
        		  double sum_m2 = 0;
        		  for(int a = 60; a < 90; a++) {
        			  sum_m2 = sum_m2 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m2/30,"平均", "中間1年2期");
        		  dataList_math_all.add(sum_m2/30);
        		  break;
        	  case 3:
        		  ds_cat_math.setValue(dataList.get(15),  "本人",  "期末1年2期");
        		  dataList_math_all.add(dataList.get(15));
        		  double sum_m3 = 0;
        		  for(int a = 90; a < 120; a++) {
        			  sum_m3 = sum_m3 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m3/30,"平均", "期末1年2期");
        		  dataList_math_all.add(sum_m3/30);
        		  break;
        	  case 4:
        		  ds_cat_math.setValue(dataList.get(16),  "本人",  "中間2年1期");
        		  dataList_math_all.add(dataList.get(16));
        		  double sum_m4 = 0;
        		  for(int a = 120; a < 150; a++) {
        			  sum_m4 = sum_m4 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m4/30,"平均", "中間2年1期");
        		  dataList_math_all.add(sum_m4/30);
        		  break;
        	  case 5:
        		  ds_cat_math.setValue(dataList.get(17),  "本人",  "期末2年1期");
        		  dataList_math_all.add(dataList.get(17));
        		  double sum_m5 = 0;
        		  for(int a = 150; a < 180; a++) {
        			  sum_m5 = sum_m5 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m5/30,"平均", "期末2年1期");
        		  dataList_math_all.add(sum_m5/30);
        		  break;
        	  case 6:
        		  ds_cat_math.setValue(dataList.get(18),  "本人",  "中間2年2期");
        		  dataList_math_all.add(dataList.get(18));
        		  double sum_m6 = 0;
        		  for(int a = 180; a < 210; a++) {
        			  sum_m6 = sum_m6 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m6/30,"平均", "中間2年2期");
        		  dataList_math_all.add(sum_m6/30);
        		  break;
        	  case 7:
        		  ds_cat_math.setValue(dataList.get(19),  "本人",  "期末2年2期");
        		  dataList_math_all.add(dataList.get(19));
        		  double sum_m7 = 0;
        		  for(int a = 210; a < 240; a++) {
        			  sum_m7 = sum_m7 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m7/30,"平均", "期末2年2期");
        		  dataList_math_all.add(sum_m7/30);
        		  break;
        	  case 8:
        		  ds_cat_math.setValue(dataList.get(20),  "本人",  "中間3年1期");
        		  dataList_math_all.add(dataList.get(20));
        		  double sum_m8 = 0;
        		  for(int a = 240; a < 270; a++) {
        			  sum_m8 = sum_m8 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m8/30,"平均", "中間3年1期");
        		  dataList_math_all.add(sum_m8/30);
        		  break;
        	  case 9:
        		  ds_cat_math.setValue(dataList.get(21),  "本人",  "期末3年1期");
        		  dataList_math_all.add(dataList.get(21));
        		  double sum_m9 = 0;
        		  for(int a = 270; a < 300; a++) {
        			  sum_m8 = sum_m9 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m9/30,"平均", "期末3年1期");
        		  dataList_math_all.add(sum_m9/30);
        		  break;
        	  case 10:
        		  ds_cat_math.setValue(dataList.get(22),  "本人",  "中間3年2期");
        		  dataList_math_all.add(dataList.get(22));
        		  double sum_m10 = 0;
        		  for(int a = 300; a < 330; a++) {
        			  sum_m10 = sum_m10 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m10/30,"平均", "中間3年2期");
        		  dataList_math_all.add(sum_m10/30);
        		  break;
        	  case 11:
        		  ds_cat_math.setValue(dataList.get(23),  "本人",  "期末3年2期");
        		  dataList_math_all.add(dataList.get(23));
        		  double sum_m11 = 0;
        		  for(int a = 330; a < 360; a++) {
        			  sum_m11 = sum_m11 + dataList_ave_math.get(a);
        	  }
        		  ds_cat_math.setValue(sum_m11/30,"平均", "期末3年2期");
        		  dataList_math_all.add(sum_m11/30);
        		  break;
        	  }
          }


          List<Double> dataList_english_all = new ArrayList<>();
          DefaultCategoryDataset ds_cat_english = new DefaultCategoryDataset();
          for(int e = starttest; e <= endtest; e++) {
        	  switch(e) {
        	  case 0:
        		  ds_cat_english.setValue(dataList.get(24), "本人", "中間1年1期");
        		  dataList_english_all.add(dataList.get(24));
        		  double sum_e0 = 0;
        		  for(int a = 0; a < 30; a++) {
        			  sum_e0 = sum_e0 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e0/30,"平均", "中間1年1期");
        		  dataList_english_all.add(sum_e0/30);
        		  break;
        	  case 1:
        		  ds_cat_english.setValue(dataList.get(25),  "本人",  "期末1年1期");
        		  dataList_english_all.add(dataList.get(25));
        		  double sum_e1 = 0;
        		  for(int a = 30; a < 60; a++) {
        			  sum_e1 = sum_e1 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e1/30,"平均", "期末1年1期");
        		  dataList_english_all.add(sum_e1/30);
        		  break;

        	  case 2:
        		  ds_cat_english.setValue(dataList.get(26),  "本人",  "中間1年2期");
        		  dataList_english_all.add(dataList.get(26));
        		  double sum_e2 = 0;
        		  for(int a = 60; a < 90; a++) {
        			  sum_e2 = sum_e2 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e2/30,"平均", "中間1年2期");
        		  dataList_english_all.add(sum_e2/30);
        		  break;
        	  case 3:
        		  ds_cat_english.setValue(dataList.get(27),  "本人",  "期末1年2期");
        		  dataList_english_all.add(dataList.get(27));
        		  double sum_e3 = 0;
        		  for(int a = 90; a < 120; a++) {
        			  sum_e3 = sum_e3 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e3/30,"平均", "期末1年2期");
        		  dataList_english_all.add(sum_e3/30);
        		  break;
        	  case 4:
        		  ds_cat_english.setValue(dataList.get(28),  "本人",  "中間2年1期");
        		  dataList_english_all.add(dataList.get(28));
        		  double sum_e4 = 0;
        		  for(int a = 120; a < 150; a++) {
        			  sum_e4 = sum_e4 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e4/30,"平均", "中間2年1期");
        		  dataList_english_all.add(sum_e4/30);
        		  break;
        	  case 5:
        		  ds_cat_english.setValue(dataList.get(29),  "本人",  "期末2年1期");
        		  dataList_english_all.add(dataList.get(29));
        		  double sum_e5 = 0;
        		  for(int a = 150; a < 180; a++) {
        			  sum_e5 = sum_e5 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e5/30,"平均", "期末2年1期");
        		  dataList_english_all.add(sum_e5/30);
        		  break;
        	  case 6:
        		  ds_cat_english.setValue(dataList.get(30),  "本人",  "中間2年2期");
        		  dataList_english_all.add(dataList.get(30));
        		  double sum_e6 = 0;
        		  for(int a = 180; a < 210; a++) {
        			  sum_e6 = sum_e6 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e6/30,"平均", "中間2年2期");
        		  dataList_english_all.add(sum_e6/30);
        		  break;
        	  case 7:
        		  ds_cat_english.setValue(dataList.get(31),  "本人",  "期末2年2期");
        		  dataList_english_all.add(dataList.get(31));
        		  double sum_e7 = 0;
        		  for(int a = 210; a < 240; a++) {
        			  sum_e7 = sum_e7 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e7/30,"平均", "期末2年2期");
        		  dataList_english_all.add(sum_e7/30);
        		  break;
        	  case 8:
        		  ds_cat_english.setValue(dataList.get(32),  "本人",  "中間3年1期");
        		  dataList_english_all.add(dataList.get(32));
        		  double sum_e8 = 0;
        		  for(int a = 240; a < 270; a++) {
        			  sum_e8 = sum_e8 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e8/30,"平均", "中間3年1期");
        		  dataList_english_all.add(sum_e8/30);
        		  break;
        	  case 9:
        		  ds_cat_english.setValue(dataList.get(33),  "本人",  "期末3年1期");
        		  dataList_english_all.add(dataList.get(33));
        		  double sum_e9 = 0;
        		  for(int a = 270; a < 300; a++) {
        			  sum_e8 = sum_e9 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e9/30,"平均", "期末3年1期");
        		  dataList_english_all.add(sum_e9/30);
        		  break;
        	  case 10:
        		  ds_cat_english.setValue(dataList.get(34),  "本人",  "中間3年2期");
        		  dataList_english_all.add(dataList.get(34));
        		  double sum_e10 = 0;
        		  for(int a = 300; a < 330; a++) {
        			  sum_e10 = sum_e10 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e10/30,"平均", "中間3年2期");
        		  dataList_english_all.add(sum_e10/30);
        		  break;
        	  case 11:
        		  ds_cat_english.setValue(dataList.get(35),  "本人",  "期末3年2期");
        		  dataList_english_all.add(dataList.get(35));
        		  double sum_e11 = 0;
        		  for(int a = 330; a < 360; a++) {
        			  sum_e11 = sum_e11 + dataList_ave_english.get(a);
        	  }
        		  ds_cat_english.setValue(sum_e11/30,"平均", "期末3年2期");
        		  dataList_english_all.add(sum_e11/30);
        		  break;

        	  }
        }


          List<Double> dataList_science_all = new ArrayList<>();
          DefaultCategoryDataset ds_cat_science = new DefaultCategoryDataset();
          for(int sc = starttest; sc <= endtest; sc++) {
        	  switch(sc) {
        	  case 0:
        		  ds_cat_science.setValue(dataList.get(36), "本人", "中間1年1期");
        		  dataList_science_all.add(dataList.get(36));
        		  double sum_sci0 = 0;
        		  for(int a = 0; a < 30; a++) {
        			  sum_sci0 = sum_sci0 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci0/30,"平均", "中間1年1期");
        		  dataList_science_all.add(sum_sci0/30);
        		  break;
        	  case 1:
        		  ds_cat_science.setValue(dataList.get(37),  "本人",  "期末1年1期");
        		  dataList_science_all.add(dataList.get(37));
        		  double sum_sci1 = 0;
        		  for(int a = 30; a < 60; a++) {
        			  sum_sci1 = sum_sci1 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci1/30,"平均", "期末1年1期");
        		  dataList_science_all.add(sum_sci1/30);
        		  break;
        	  case 2:
        		  ds_cat_science.setValue(dataList.get(38),  "本人",  "中間1年2期");
        		  dataList_science_all.add(dataList.get(38));
        		  double sum_sci2 = 0;
        		  for(int a = 60; a < 90; a++) {
        			  sum_sci2 = sum_sci2 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci2/30,"平均", "中間1年2期");
        		  dataList_science_all.add(sum_sci2/30);
        		  break;
        	  case 3:
        		  ds_cat_science.setValue(dataList.get(39),  "本人",  "期末1年2期");
        		  dataList_science_all.add(dataList.get(39));
        		  double sum_sci3 = 0;
        		  for(int a = 90; a < 120; a++) {
        			  sum_sci3 = sum_sci3 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci3/30,"平均", "期末1年2期");
        		  dataList_science_all.add(sum_sci3/30);
        		  break;
        	  case 4:
        		  ds_cat_science.setValue(dataList.get(40),  "本人",  "中間2年1期");
        		  dataList_science_all.add(dataList.get(40));
        		  double sum_sci4 = 0;
        		  for(int a = 120; a < 150; a++) {
        			  sum_sci4 = sum_sci4 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci4/30,"平均", "中間2年1期");
        		  dataList_science_all.add(sum_sci4/30);
        		  break;
        	  case 5:
        		  ds_cat_science.setValue(dataList.get(41),  "本人",  "期末2年1期");
        		  dataList_science_all.add(dataList.get(41));
        		  double sum_sci5 = 0;
        		  for(int a = 150; a < 180; a++) {
        			  sum_sci5 = sum_sci5 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci5/30,"平均", "期末2年1期");
        		  dataList_science_all.add(sum_sci5/30);
        		  break;
        	  case 6:
        		  ds_cat_science.setValue(dataList.get(42),  "本人",  "中間2年2期");
        		  dataList_science_all.add(dataList.get(42));
        		  double sum_sci6 = 0;
        		  for(int a = 180; a < 210; a++) {
        			  sum_sci6 = sum_sci6 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci6/30,"平均", "中間2年2期");
        		  dataList_science_all.add(sum_sci6/30);
        		  break;
        	  case 7:
        		  ds_cat_science.setValue(dataList.get(43),  "本人",  "期末2年2期");
        		  dataList_science_all.add(dataList.get(43));
        		  double sum_sci7 = 0;
        		  for(int a = 210; a < 240; a++) {
        			  sum_sci7 = sum_sci7 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci7/30,"平均", "期末2年2期");
        		  dataList_science_all.add(sum_sci7/30);
        		  break;
        	  case 8:
        		  ds_cat_science.setValue(dataList.get(44),  "本人",  "中間3年1期");
        		  dataList_science_all.add(dataList.get(44));
        		  double sum_sci8 = 0;
        		  for(int a = 240; a < 270; a++) {
        			  sum_sci8 = sum_sci8 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci8/30,"平均", "中間3年1期");
        		  dataList_science_all.add(sum_sci8/30);
        		  break;
        	  case 9:
        		  ds_cat_science.setValue(dataList.get(45),  "本人",  "期末3年1期");
        		  dataList_science_all.add(dataList.get(45));
        		  double sum_sci9 = 0;
        		  for(int a = 270; a < 300; a++) {
        			  sum_sci9 = sum_sci9 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci9/30,"平均", "期末3年1期");
        		  dataList_science_all.add(sum_sci9/30);
        		  break;
        	  case 10:
        		  ds_cat_science.setValue(dataList.get(46),  "本人",  "中間3年2期");
        		  dataList_science_all.add(dataList.get(46));
        		  double sum_sci10 = 0;
        		  for(int a = 300; a < 330; a++) {
        			  sum_sci10 = sum_sci10 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci10/30,"平均", "中間3年2期");
        		  dataList_science_all.add(sum_sci10/30);
        		  break;
        	  case 11:
        		  ds_cat_science.setValue(dataList.get(47),  "本人",  "期末3年2期");
        		  dataList_science_all.add(dataList.get(47));
        		  double sum_sci11 = 0;
        		  for(int a = 330; a < 360; a++) {
        			  sum_sci11 = sum_sci11 + dataList_ave_science.get(a);
        	  }
        		  ds_cat_science.setValue(sum_sci11/30,"平均", "期末3年2期");
        		  dataList_science_all.add(sum_sci11/30);
        		  break;
        	  }
          }



         List<Double> dataList_social_all = new ArrayList<>();
          DefaultCategoryDataset ds_cat_social = new DefaultCategoryDataset();
          for(int so = starttest; so <= endtest; so++) {
        	  switch(so) {
        	  case 0:
        		  ds_cat_social.setValue(dataList.get(48), "本人", "中間1年1期");
        		  dataList_social_all.add(dataList.get(48));
        		  double sum_soc0 = 0;
        		  for(int a = 0; a < 30; a++) {
        			  sum_soc0 = sum_soc0 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc0/30,"平均", "中間1年1期");
        		  dataList_social_all.add(sum_soc0/30);
        		  break;
        	  case 1:
        		  ds_cat_social.setValue(dataList.get(49),  "本人",  "期末1年1期");
        		  dataList_social_all.add(dataList.get(49));
        		  double sum_soc1 = 0;
        		  for(int a = 30; a < 60; a++) {
        			  sum_soc1 = sum_soc1 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc1/30,"平均", "期末1年1期");
        		  dataList_social_all.add(sum_soc1/30);
        		  break;
        	  case 2:
        		  ds_cat_social.setValue(dataList.get(50),  "本人",  "中間1年2期");
        		  dataList_social_all.add(dataList.get(50));
        		  double sum_soc2 = 0;
        		  for(int a = 60; a < 90; a++) {
        			  sum_soc2 = sum_soc2 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc2/30,"平均", "中間1年2期");
        		  dataList_social_all.add(sum_soc2/30);
        		  break;
        	  case 3:
        		  ds_cat_social.setValue(dataList.get(51),  "本人",  "期末1年2期");
        		  dataList_social_all.add(dataList.get(51));
        		  double sum_soc3 = 0;
        		  for(int a = 90; a < 120; a++) {
        			  sum_soc3 = sum_soc3 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc3/30,"平均", "期末1年2期");
        		  dataList_social_all.add(sum_soc3/30);
        		  break;
        	  case 4:
        		  ds_cat_social.setValue(dataList.get(52),  "本人",  "中間2年1期");
      		  dataList_social_all.add(dataList.get(52));
       		  double sum_soc4 = 0;
       		  for(int a = 120; a < 150; a++) {
       			  sum_soc4 = sum_soc4 + dataList_ave_social.get(a);
       	  }
       		  ds_cat_social.setValue(sum_soc4/30,"平均", "中間2年1期");
       		  dataList_social_all.add(sum_soc4/30);
       		  break;
        	  case 5:
        		  ds_cat_social.setValue(dataList.get(53),  "本人",  "期末2年1期");
        		  dataList_social_all.add(dataList.get(53));
        		  double sum_soc5 = 0;
        		  for(int a = 150; a < 180; a++) {
        			  sum_soc5 = sum_soc5 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc5/30,"平均", "期末2年1期");
        		  dataList_social_all.add(sum_soc5/30);
        		  break;
        	  case 6:
        		  ds_cat_social.setValue(dataList.get(54),  "本人",  "中間2年2期");
        		  dataList_social_all.add(dataList.get(54));
        		  double sum_soc6 = 0;
        		  for(int a = 180; a < 210; a++) {
        			  sum_soc6 = sum_soc6 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc6/30,"平均", "中間2年2期");
        		  dataList_social_all.add(sum_soc6/30);
        		  break;
        	  case 7:
        		  ds_cat_social.setValue(dataList.get(55),  "本人",  "期末2年2期");
        		  dataList_social_all.add(dataList.get(55));
        		  double sum_soc7 = 0;
        		  for(int a = 210; a < 240; a++) {
        			  sum_soc7 = sum_soc7 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc7/30,"平均", "期末2年2期");
        		  dataList_social_all.add(sum_soc7/30);
        		  break;
        	  case 8:
        		  ds_cat_social.setValue(dataList.get(56),  "本人",  "中間3年1期");
        		  dataList_social_all.add(dataList.get(56));
        		  double sum_soc8 = 0;
        		  for(int a = 240; a < 270; a++) {
        			  sum_soc8 = sum_soc8 + dataList_ave_social.get(a);
        	  }
        		  ds_cat_social.setValue(sum_soc8/30,"平均", "中間3年1期");
        		  dataList_social_all.add(sum_soc8/30);
        		  break;
        	  case 9:
        		  ds_cat_social.setValue(dataList.get(57),  "本人",  "期末3年1期");
        		  dataList_social_all.add(dataList.get(57));
        		  double sum_soc9 = 0;
        		  for(int a = 270; a < 300; a++) {
        			  sum_soc9 = sum_soc9 + dataList_ave_social.get(a);
        		  }
        		  ds_cat_social.setValue(sum_soc9/30,"平均", "期末3年1期");
        		  dataList_social_all.add(sum_soc9/30);
        		  break;
        	  case 10:
        		  ds_cat_social.setValue(dataList.get(58),  "本人",  "中間3年2期");
        		  dataList_social_all.add(dataList.get(58));
        		  double sum_soc10 = 0;
        		  for(int a = 300; a < 330; a++) {
        			  sum_soc10 = sum_soc10 + dataList_ave_social.get(a);
        		  }
        		  break;
        		  case 11:
        			  ds_cat_social.setValue(dataList.get(59),  "本人",  "期末3年2期");
            		  dataList_social_all.add(dataList.get(59));
            		  double sum_soc11 = 0;
            		  for(int a = 330; a < 360; a++) {
            			  sum_soc11 = sum_soc11 + dataList_ave_social.get(a);
            	  }
            		  ds_cat_social.setValue(sum_soc11/30,"平均", "期末3年2期");
            		  dataList_social_all.add(sum_soc11/30);
            		  break;
        	  }
          }


        List<Double> dataList_goukei_all = new ArrayList<>();
          DefaultCategoryDataset ds_cat_goukei = new DefaultCategoryDataset();
          for(int go = starttest; go <= endtest; go++) {
        	  switch(go) {
        	  case 0:
        		  ds_cat_goukei.setValue(dataList.get(60), "本人", "中間1年1期");
        		  dataList_goukei_all.add(dataList.get(60));
        		  double sum_g0 = 0;
        		  for(int a = 0; a < 30; a++) {
        			  sum_g0 = sum_g0 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g0/30,"平均", "中間1年1期");
        		  dataList_goukei_all.add(sum_g0/30);
        		  break;
        	  case 1:
        		  ds_cat_goukei.setValue(dataList.get(61),  "本人",  "期末1年1期");
        		  dataList_goukei_all.add(dataList.get(61));
        		  double sum_g1 = 0;
        		  for(int a = 30; a < 60; a++) {
        			  sum_g1 = sum_g1 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g1/30,"平均", "期末1年1期");
        		  dataList_goukei_all.add(sum_g1/30);
        		  break;
        	  case 2:
        		  ds_cat_goukei.setValue(dataList.get(62),  "本人",  "中間1年2期");
        		  dataList_goukei_all.add(dataList.get(62));
        		  double sum_g2 = 0;
        		  for(int a = 60; a < 90; a++) {
        			  sum_g2 = sum_g2 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g2/30,"平均", "中間1年2期");
        		  dataList_goukei_all.add(sum_g2/30);
        		  break;
        	  case 3:
        		  ds_cat_goukei.setValue(dataList.get(63),  "本人",  "期末1年2期");
        		  dataList_goukei_all.add(dataList.get(63));
        		  double sum_g3 = 0;
        		  for(int a = 90; a < 120; a++) {
        			  sum_g3 = sum_g3 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g3/30,"平均", "期末1年2期");
        		  dataList_goukei_all.add(sum_g3/30);
        	  break;
        	  case 4:
        		  ds_cat_goukei.setValue(dataList.get(64),  "本人",  "中間2年1期");
        		  dataList_goukei_all.add(dataList.get(64));
        		  double sum_g4 = 0;
        		  for(int a = 120; a < 150; a++) {
        			  sum_g4 = sum_g4 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g4/30,"平均", "中間2年1期");
        		  dataList_goukei_all.add(sum_g4/30);
        		  break;
        	  case 5:
        		  ds_cat_goukei.setValue(dataList.get(65),  "本人",  "期末2年1期");
        		  dataList_goukei_all.add(dataList.get(65));
        		  double sum_g5 = 0;
        		  for(int a = 150; a < 180; a++) {
        			  sum_g5 = sum_g5 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g5/30,"平均", "期末2年1期");
        		  dataList_goukei_all.add(sum_g5/30);
        		  break;
        	  case 6:
        		  ds_cat_goukei.setValue(dataList.get(66),  "本人",  "中間2年2期");
        		  dataList_goukei_all.add(dataList.get(66));
        		  double sum_g6 = 0;
        		  for(int a = 180; a < 210; a++) {
        			  sum_g6 = sum_g6 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g6/30,"平均", "中間2年2期");
        		  dataList_goukei_all.add(sum_g6/30);
        		  break;
        	  case 7:
        		  ds_cat_goukei.setValue(dataList.get(67),  "本人",  "期末2年2期");
        		  dataList_goukei_all.add(dataList.get(67));
        		  double sum_g7 = 0;
        		  for(int a = 210; a < 240; a++) {
        			  sum_g7 = sum_g7 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g7/30,"平均", "期末2年2期");
        		  dataList_goukei_all.add(sum_g7/30);
        		  break;
        	  case 8:
        		  ds_cat_goukei.setValue(dataList.get(68),  "本人",  "中間3年1期");
        		  dataList_goukei_all.add(dataList.get(68));
        		  double sum_g8 = 0;
        		  for(int a = 240; a < 270; a++) {
        			  sum_g8 = sum_g8 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g8/30,"平均", "中間3年1期");
        		  dataList_goukei_all.add(sum_g8/30);
        		  break;
        	  case 9:
        		  ds_cat_goukei.setValue(dataList.get(69),  "本人",  "期末3年1期");
        		  dataList_goukei_all.add(dataList.get(69));
        		  double sum_g9 = 0;
        		  for(int a = 270; a < 300; a++) {
        			  sum_g9 = sum_g9 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g9/30,"平均", "期末3年1期");
        		  dataList_goukei_all.add(sum_g9/30);
        		  break;
        	  case 10:
        		  ds_cat_goukei.setValue(dataList.get(70),  "本人",  "中間3年2期");
        		  dataList_goukei_all.add(dataList.get(70));
        		  double sum_g10 = 0;
        		  for(int a = 300; a < 330; a++) {
        			  sum_g10 = sum_g10 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g10/30,"平均", "中間3年2期");
        		  dataList_goukei_all.add(sum_g10/30);
        		  break;
        	  case 11:
        		  ds_cat_goukei.setValue(dataList.get(71),  "本人",  "期末3年2期");
        		  dataList_goukei_all.add(dataList.get(71));
        		  double sum_g11 = 0;
        		  for(int a = 330; a < 360; a++) {
        			  sum_g11 = sum_g11 + dataList_ave_goukei.get(a);
        	  }
        		  ds_cat_goukei.setValue(sum_g11/30,"平均", "期末3年2期");
        		  dataList_goukei_all.add(sum_g11/30);
        		  break;
        	  }
          }


          // 最大値と最小値の取得
          double maxValue_japanese = Collections.max(dataList_japanese_all);
          double minValue_japanese = Collections.min(dataList_japanese_all);
          double maxValue_math = Collections.max(dataList_math_all);
          double minValue_math = Collections.min(dataList_math_all);
          double maxValue_english = Collections.max(dataList_english_all);
          double minValue_english = Collections.min(dataList_english_all);
          double maxValue_science = Collections.max(dataList_science_all);
          double minValue_science = Collections.min(dataList_science_all);
          double maxValue_social = Collections.max(dataList_social_all);
          double minValue_social = Collections.min(dataList_social_all);
          double maxValue_goukei = Collections.max(dataList_goukei_all);
          double minValue_goukei = Collections.min(dataList_goukei_all);

          System.out.println("最大値合計: " + maxValue_goukei);
          System.out.println("最小値合計: " + minValue_goukei);
          	System.out.println("japanese"+ds_cat_japanese);
          	// 折れ線グラフ生成(JFreechartオブジェクトの生成)
              JFreeChart chart_japanese = ChartFactory.createLineChart("国語", "テスト名", "点",
                      ds_cat_japanese, PlotOrientation.VERTICAL, true, false, false);
  			chart_japanese.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(4));
  			chart_japanese.getCategoryPlot().getRenderer().setSeriesStroke(1, new BasicStroke(4));
  			chart_japanese.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
  			chart_japanese.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
           // 軸の範囲を設定
      		chart_japanese.getCategoryPlot().getRangeAxis().setRange(minValue_japanese - 5, maxValue_japanese + 5);

              // 画像の生成+保存

              File imageFile_japanese = new File("sample_japanese.png");
              ChartUtilities.saveChartAsPNG(imageFile_japanese, chart_japanese, width, height);
              System.out.println("PNG画像を生成しました: " + imageFile_japanese.getAbsolutePath());

           // 移動元のファイルを読み込み
              Path sourcePath_japanese = Paths.get(sourceFilePath_japanese);
              // 移動先のディレクトリを読み込み,全部共通の移動先
              Path destinationPath_japanese = Paths.get(destinationDirectory);

              // ファイルを移動
              Files.move(sourcePath_japanese, destinationPath_japanese.resolve(sourcePath_japanese.getFileName()));
              System.out.println("ファイルが移動されました。" + absolutePath_japanese);


            	System.out.println(ds_cat_math);
              	// 折れ線グラフ生成(JFreechartオブジェクトの生成)
                  JFreeChart chart_math = ChartFactory.createLineChart("数学", "テスト名", "点",
                          ds_cat_math, PlotOrientation.VERTICAL, true, false, false);
      			chart_math.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(4));
      			chart_math.getCategoryPlot().getRenderer().setSeriesStroke(1, new BasicStroke(4));
      			chart_math.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
      			chart_math.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));

               // 軸の範囲を設定
          		chart_math.getCategoryPlot().getRangeAxis().setRange(minValue_math - 5, maxValue_math + 5);

                  // 画像の生成+保存

                  File imageFile_math = new File("sample_math.png");
                  ChartUtilities.saveChartAsPNG(imageFile_math, chart_math, width, height);
                  System.out.println("PNG画像を生成しました: " + imageFile_math.getAbsolutePath());

               // 移動元のファイルを読み込み
                  Path sourcePath_math = Paths.get(sourceFilePath_math);
                  // 移動先のディレクトリを読み込み,全部共通の移動先
                  Path destinationPath_math = Paths.get(destinationDirectory);

                  // ファイルを移動
                  Files.move(sourcePath_math, destinationPath_math.resolve(sourcePath_math.getFileName()));
                  System.out.println("ファイルが移動されました。" + absolutePath_math);

              	System.out.println(ds_cat_english);
              	// 折れ線グラフ生成(JFreechartオブジェクトの生成)
                  JFreeChart chart_english = ChartFactory.createLineChart("英語", "テスト名", "点",
                          ds_cat_english, PlotOrientation.VERTICAL, true, false, false);
      			chart_english.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(4));
      			chart_english.getCategoryPlot().getRenderer().setSeriesStroke(1, new BasicStroke(4));
      			chart_english.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
      			chart_english.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
               // 軸の範囲を設定
          		chart_english.getCategoryPlot().getRangeAxis().setRange(minValue_english - 5, maxValue_english + 5);

                  // 画像の生成+保存

                  File imageFile_english = new File("sample_english.png");
                  ChartUtilities.saveChartAsPNG(imageFile_english, chart_english, width, height);
                  System.out.println("PNG画像を生成しました: " + imageFile_english.getAbsolutePath());

               // 移動元のファイルを読み込み
                  Path sourcePath_english = Paths.get(sourceFilePath_english);
                  // 移動先のディレクトリを読み込み,全部共通の移動先
                  Path destinationPath_english = Paths.get(destinationDirectory);

                  // ファイルを移動
                  Files.move(sourcePath_english, destinationPath_english.resolve(sourcePath_english.getFileName()));
                  System.out.println("ファイルが移動されました。" + absolutePath_english);


              	System.out.println(ds_cat_science);
              	// 折れ線グラフ生成(JFreechartオブジェクトの生成)
                  JFreeChart chart_science = ChartFactory.createLineChart("理科", "テスト名", "点",
                          ds_cat_science, PlotOrientation.VERTICAL, true, false, false);
      			chart_science.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(4));
      			chart_science.getCategoryPlot().getRenderer().setSeriesStroke(1, new BasicStroke(4));
      			chart_science.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
      			chart_science.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
               // 軸の範囲を設定
          		chart_science.getCategoryPlot().getRangeAxis().setRange(minValue_science - 5, maxValue_science + 5);

                  // 画像の生成+保存

                  File imageFile_science = new File("sample_science.png");
                  ChartUtilities.saveChartAsPNG(imageFile_science, chart_science, width, height);
                  System.out.println("PNG画像を生成しました: " + imageFile_science.getAbsolutePath());

               // 移動元のファイルを読み込み
                  Path sourcePath_science = Paths.get(sourceFilePath_science);
                  // 移動先のディレクトリを読み込み,全部共通の移動先
                  Path destinationPath_science = Paths.get(destinationDirectory);

                  // ファイルを移動
                  Files.move(sourcePath_science, destinationPath_science.resolve(sourcePath_science.getFileName()));
                  System.out.println("ファイルが移動されました。" + absolutePath_science);


                  System.out.println(ds_cat_social);
                	// 折れ線グラフ生成(JFreechartオブジェクトの生成)
                    JFreeChart chart_social = ChartFactory.createLineChart("社会", "テスト名", "点",
                            ds_cat_social, PlotOrientation.VERTICAL, true, false, false);
        			chart_social.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(4));
        			chart_social.getCategoryPlot().getRenderer().setSeriesStroke(1, new BasicStroke(4));
        			chart_social.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
        			chart_social.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
                 // 軸の範囲を設定
            		chart_social.getCategoryPlot().getRangeAxis().setRange(minValue_social - 5, maxValue_social + 5);

                    // 画像の生成+保存

                    File imageFile_social = new File("sample_social.png");
                    ChartUtilities.saveChartAsPNG(imageFile_social, chart_social, width, height);
                    System.out.println("PNG画像を生成しました: " + imageFile_social.getAbsolutePath());

                 // 移動元のファイルを読み込み
                    Path sourcePath_social = Paths.get(sourceFilePath_social);
                    // 移動先のディレクトリを読み込み,全部共通の移動先
                    Path destinationPath_social = Paths.get(destinationDirectory);

                    // ファイルを移動
                    Files.move(sourcePath_social, destinationPath_social.resolve(sourcePath_social.getFileName()));
                    System.out.println("ファイルが移動されました。" + absolutePath_social);


                    System.out.println(ds_cat_goukei);
                	// 折れ線グラフ生成(JFreechartオブジェクトの生成)
                    JFreeChart chart_goukei = ChartFactory.createLineChart("合計", "テスト名", "点",
                            ds_cat_goukei, PlotOrientation.VERTICAL, true, false, false);
        			chart_goukei.getCategoryPlot().getRenderer().setSeriesStroke(0, new BasicStroke(4));
        			chart_goukei.getCategoryPlot().getRenderer().setSeriesStroke(1, new BasicStroke(4));
        			chart_goukei.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
        			chart_goukei.getCategoryPlot().getRenderer().setSeriesStroke(2, new BasicStroke(4));
    				// 軸の範囲を設定
        			chart_goukei.getCategoryPlot().getRangeAxis().setRange(minValue_goukei - 5, maxValue_goukei + 5);


                    // 画像の生成+保存

                    File imageFile_goukei = new File("sample_goukei.png");
                    ChartUtilities.saveChartAsPNG(imageFile_goukei, chart_goukei, width, height);
                    System.out.println("PNG画像を生成しました: " + imageFile_goukei.getAbsolutePath());

                 // 移動元のファイルを読み込み
                    Path sourcePath_goukei = Paths.get(sourceFilePath_goukei);
                    // 移動先のディレクトリを読み込み,全部共通の移動先
                    Path destinationPath_goukei = Paths.get(destinationDirectory);

                    // ファイルを移動
                    Files.move(sourcePath_goukei, destinationPath_goukei.resolve(sourcePath_goukei.getFileName()));
                    System.out.println("ファイルが移動されました。" + absolutePath_goukei);

        } catch (SQLException e) {
            e.printStackTrace();
            forwardURL = "/database/selecterror.jsp";
        }
        request.getRequestDispatcher(forwardURL).forward(request, response);
    }
}

