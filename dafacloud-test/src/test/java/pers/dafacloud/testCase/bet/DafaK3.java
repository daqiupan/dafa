package pers.dafacloud.testCase.bet;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pers.dafacloud.page.beting.Betting;
import pers.dafacloud.page.beting.InitializaIssueEndtime;
import pers.dafacloud.pojo.BetContent;
import pers.dafacloud.utils.common.ReadCSV;
import pers.dafacloud.utils.report.ZTestReport;

import java.util.List;

@Listeners({ ZTestReport.class })
public class DafaK3 {

    static List<BetContent>  listBetContent =  ReadCSV.readCSV();


    @BeforeClass
    public void beforeClass() {

    }

    //插入文件

    @Test(priority = 1,description ="二码直选")
    public void testUsersInfo(){
        BetContent betContent = listBetContent.get(0);
        betContent.setBettingIssue(String.valueOf(InitializaIssueEndtime.issueFive));
        Betting.bet(betContent);
    }
}
