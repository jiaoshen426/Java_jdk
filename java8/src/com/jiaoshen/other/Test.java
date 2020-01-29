package com.jiaoshen.other;

import com.jiaoshen.pojo.Tbean;
import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 一个Bean有三个属性
 * id;
 * num;
 * AllNum;
 *
 * 所有id相同的数据AllNum也相同
 * 现在有一个List<Bean>
 * 要求判断id相同数据中num的和是否大于单条数据的allNum（因为单条数据的AllNum是相同的）
 * @author jiaoshen
 * @date 2020/1/9-23:24
 */
public class Test {
    public static void main(String[] args) {
        List<Tbean> l1 = new ArrayList();
        l1.add(new Tbean("201101",201101,2000));
        l1.add(new Tbean("201101",201101,2000));
        l1.add(new Tbean("201102",201102,2000));
        l1.add(new Tbean("201102",201102,2000));
        l1.add(new Tbean("201102",201102,2000));
        l1.add(new Tbean("201103",201103,2000));
        l1.add(new Tbean("201103",201103,2000));
        l1.add(new Tbean("201103",201103,2000000));
        Map<String, IntSummaryStatistics> mapSUM = l1.stream().collect(Collectors.groupingBy(Tbean::getId, Collectors.summarizingInt(Tbean::getNum)));
        List<String> numOverIdList=   l1.stream().filter(tbean -> tbean.getAllNum()<mapSUM.get(tbean.getId()).getSum())
                .map(Tbean::getId).distinct().collect(Collectors.toList());
        System.out.println(numOverIdList);


    }
}
