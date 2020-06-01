package dev.kuldip.budget.manager.data.db;

import dev.kuldip.budget.manager.data.db.model.Option;
import dev.kuldip.budget.manager.data.db.model.Question;
import dev.kuldip.budget.manager.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by Kuldip on 08/12/16.
 */

public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();

    Observable<List<Question>> getAllQuestions();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveQuestionList(List<Question> questionList);

    Observable<Boolean> saveOptionList(List<Option> optionList);
}
