package ro.razvan.server.collegeBalanceManager.data

import ro.razvan.server.collegeBalanceManager.data.users.User

interface CollegeBalanceStorage {
    fun searchUser(username: String): List<User>
}