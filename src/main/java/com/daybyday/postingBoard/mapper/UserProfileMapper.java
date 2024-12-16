package com.daybyday.postingBoard.mapper;


import com.daybyday.postingBoard.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserProfileMapper {

    //Mybatis의 SQL 문장에 다수의 파라미터를 전달할 때는 전달되는 변수들에 꼭 @Param 어노테이션을 붙여줘야한다. https://dblee.tistory.com/145

    public UserDTO getUserProfile(@Param("id") String id);

    int insertUserProfile(@Param("id") String id, @Param("password") String password, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);

    int updateUserProfile(@Param("id") String id, @Param("password") String password, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);

    int deleteUserProfile(@Param("id") String id);

    public int register(UserDTO userDTO);

    public UserDTO findByIdAndPassword(@Param("id") String id,
                                       @Param("password") String password);

    public UserDTO findByUserIdAndPassword(@Param("userId") String userId,
                                       @Param("password") String password);

    int idCheck(String id);

    public int updatePassword(UserDTO userDTO);

    public int updateAddress(UserDTO userDTO);
    
}
