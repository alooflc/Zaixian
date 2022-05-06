package com.liuchang.serviceedu.service;

import com.liuchang.serviceedu.entity.EduChapter;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liuchang.serviceedu.entity.chapter.ChapterVo;

import java.util.List;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author liuchang
 * @since 2022-04-26
 */
public interface EduChapterService extends IService<EduChapter> {
    List<ChapterVo> getChapterVoByCourseId(String courseId);

    boolean deleteChapterById(String chapterId);

    void removeChapterByCourseId(String courseId);
}
