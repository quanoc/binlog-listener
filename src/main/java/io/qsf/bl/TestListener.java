package io.qsf.bl;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.github.shyiko.mysql.binlog.event.Event;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * Created by zqq on 18-11-10.
 */
@Slf4j
public class TestListener {

    public static void main(String[] args) throws IOException {
        BinaryLogClient client = new BinaryLogClient("api.quartz.ren", 3306, "qsf", "quantumcsqsf");
        client.registerEventListener(event -> log.info(event.toString()));
        client.connect();
    }
}
